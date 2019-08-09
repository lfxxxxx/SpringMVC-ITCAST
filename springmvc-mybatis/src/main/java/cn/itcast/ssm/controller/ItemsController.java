package cn.itcast.ssm.controller;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;
import cn.itcast.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author LFX
 * @create 2019-08-06 20:54
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
	@Autowired
	private ItemsService itemsService;

	@RequestMapping("/queryItems")
	public ModelAndView findItemsList(HttpServletRequest request, ItemsQueryVo itemsQueryVo) {

		List<ItemsCustom> itemsList = itemsService.findItemsList(itemsQueryVo);

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("itemsList", itemsList);

		modelAndView.setViewName("items/itemsList");

		return modelAndView;

	}

	//商品信息展示
	@RequestMapping("/editItems")
	public String editItems(Model model, Integer id) {

		ItemsCustom itemsCustom = itemsService.findItemsById(id);

		model.addAttribute("itemsCustom", itemsCustom);

		return "items/editItems";
	}


	//商品信息提交
	//@Validated用于校验
	//BindingResult bindingResult, 用于接收校验消息
	//上述两者配对出现
	@RequestMapping("/editItemsSubmit")
	public String editItemsSubmit(Model model, Integer id, ItemsCustom itemsCustom) {

//		if(bindingResult.hasErrors()){
//			List<ObjectError> allErrors = bindingResult.getAllErrors();
//			for (ObjectError objectError : allErrors) {
//				System.out.println(objectError.getDefaultMessage());
//			}
//			model.addAttribute("allErrors", allErrors);
//			return "items/editItems";
//		}

		itemsService.updateItems(id, itemsCustom);

		return "forward:queryItems.action";
	}

	@RequestMapping("/deleteItems")
	public String deleteItems(Integer[] items_id){

		return "success";
	}

	//批量修改商品页面，
	@RequestMapping("/editItemsQuery")
	public ModelAndView editItemsQuery(HttpServletRequest request, ItemsQueryVo itemsQueryVo) {

		List<ItemsCustom> itemsList = itemsService.findItemsList(itemsQueryVo);

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("items/editItemsQuery");

		return modelAndView;

	}

	@RequestMapping("/editItemsAllSubmit")
	public String editItemsAllSubmit(ItemsQueryVo itemsQueryVo){
		return "success";
	}
}



package cn.itcast.ssm.controller;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author LFX
 * @create 2019-08-06 20:54
 */
@Controller
public class ItemsController {
	@Autowired
	public ItemsService itemsService;

	@RequestMapping("/queryItems")
	public ModelAndView findItemsList() throws Exception {
		List<ItemsCustom> itemsList = itemsService.findItemsList(null);

		//返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		//相当 于request的setAttribute，在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList", itemsList);

		//指定视图
		modelAndView.setViewName("items/itemsList");

		String[] arr = new String[]{"TOM", "Hanmeimei"};

		return modelAndView;
	}

	//商品信息修改页面展示
}



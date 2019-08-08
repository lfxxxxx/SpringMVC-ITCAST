package cn.itcast.ssm.controller;

import cn.itcast.ssm.po.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class ItemsController3 {

	@RequestMapping("/queryItems4")
	public ModelAndView queryItems4() throws Exception {
		List<Items> itemsList = new ArrayList<>();

		Items items_1 = new Items();
		items_1.setName("联想笔记本");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

		Items items_2 = new Items();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6苹果手机！");

		itemsList.add(items_1);
		itemsList.add(items_2);

		//返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		//相当 于request的setAttribute，在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList", itemsList);

		//指定视图
		modelAndView.setViewName("items/itemsList");

		String[] arr = new String[]{"TOM", "Hanmeimei"};

		return modelAndView;
	}


}

package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.dao.ItemsMapper;
import cn.itcast.ssm.dao.ItemsMapperCustom;
import cn.itcast.ssm.po.Items;
import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;
import cn.itcast.ssm.service.ItemsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author LFX
 * @create 2019-08-06 20:31
 */
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsMapperCustom itemsMapperCustom;

	@Autowired
	private ItemsMapper itemsMapper;

	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) {
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

	@Override
	public ItemsCustom findItemsById(Integer id) {

		Items items = itemsMapper.selectByPrimaryKey(id);

		//...逻辑业务处理

		ItemsCustom itemsCustom = new ItemsCustom();

		BeanUtils.copyProperties(items, itemsCustom);

		return itemsCustom;
	}

	@Override
	public void updateItems(Integer id, ItemsCustom itemsCustom) {
		//添加业务校验，service接口对关键参数进行校验
		//校验id是否为空，如果为空抛出异常

		//更新商品信息
		itemsCustom.setId(id);
		itemsMapper.updateByPrimaryKey(itemsCustom);

	}
}

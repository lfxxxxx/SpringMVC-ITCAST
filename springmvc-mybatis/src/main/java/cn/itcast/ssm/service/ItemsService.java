package cn.itcast.ssm.service;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;

import java.util.List;

/**
 * @author LFX
 * @create 2019-08-06 20:29
 * 商品管理service
 */
public interface ItemsService {
	//查询商品列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo);

	//根据id商品信息
	public ItemsCustom findItemsById(Integer id);

	//修改商品信息
	public void updateItems(Integer id, ItemsCustom itemsCustom);
}

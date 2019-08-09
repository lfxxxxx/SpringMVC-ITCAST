package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;

import java.util.List;

/**
 * @author LFX
 * @create 2019-08-06 20:06
 */
public interface ItemsMapperCustom {

	List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo);

}

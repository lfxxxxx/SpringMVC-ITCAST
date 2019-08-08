package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.Items;

/**
@author LFX
@create 2019-08-06 17:23
*/
public interface ItemsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);

}
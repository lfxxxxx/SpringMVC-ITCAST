package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.Orders;

/**
@author LFX
@create 2019-08-06 17:24
*/
public interface OrdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}
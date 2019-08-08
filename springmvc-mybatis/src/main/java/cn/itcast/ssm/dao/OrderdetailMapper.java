package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.Orderdetail;

/**
@author LFX
@create 2019-08-06 17:24
*/
public interface OrderdetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orderdetail record);

    int insertSelective(Orderdetail record);

    Orderdetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orderdetail record);

    int updateByPrimaryKey(Orderdetail record);
}
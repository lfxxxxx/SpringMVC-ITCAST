package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.User;

/**
@author LFX
@create 2019-08-06 17:24
*/
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User findUserById(int i);
}
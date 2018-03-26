package com.suneee.cloud.springclouddao.inf;

import com.suneee.cloud.model.Girl;

public interface GirlDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Girl record);

    int insertSelective(Girl record);

    Girl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Girl record);

    int updateByPrimaryKey(Girl record);
}
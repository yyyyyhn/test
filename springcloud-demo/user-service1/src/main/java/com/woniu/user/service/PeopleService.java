package com.woniu.user.service;

import com.woniu.user.entity.People;
import com.woniu.user.entity.PeopleExample;

import java.util.List;

public interface PeopleService{


    long countByExample(PeopleExample example);

    int deleteByExample(PeopleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(People record);

    int insertSelective(People record);

    List<People> selectByExample(PeopleExample example);

    People selectByPrimaryKey(Integer id);

    int updateByExampleSelective(People record, PeopleExample example);

    int updateByExample(People record, PeopleExample example);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);

}

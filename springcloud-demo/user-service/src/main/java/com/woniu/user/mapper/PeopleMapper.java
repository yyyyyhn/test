package com.woniu.user.mapper;

import com.woniu.user.entity.People;
import com.woniu.user.entity.PeopleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeopleMapper {
    long countByExample(PeopleExample example);

    int deleteByExample(PeopleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(People record);

    int insertSelective(People record);

    List<People> selectByExample(PeopleExample example);

    People selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") People record, @Param("example") PeopleExample example);

    int updateByExample(@Param("record") People record, @Param("example") PeopleExample example);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);
}
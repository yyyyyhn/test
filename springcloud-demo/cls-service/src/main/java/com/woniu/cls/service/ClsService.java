package com.woniu.cls.service;

import java.util.List;
import com.woniu.cls.entity.ClsExample;
import com.woniu.cls.entity.Cls;
public interface ClsService{


    long countByExample(ClsExample example);

    int deleteByExample(ClsExample example);

    int deleteByPrimaryKey(Integer cno);

    int insert(Cls record);

    int insertSelective(Cls record);

    List<Cls> selectByExample(ClsExample example);

    Cls selectByPrimaryKey(Integer cno);

    int updateByExampleSelective(Cls record,ClsExample example);

    int updateByExample(Cls record,ClsExample example);

    int updateByPrimaryKeySelective(Cls record);

    int updateByPrimaryKey(Cls record);

}

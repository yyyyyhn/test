package com.woniu.cls.mapper;

import com.woniu.cls.entity.Cls;
import com.woniu.cls.entity.ClsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClsMapper {
    long countByExample(ClsExample example);

    int deleteByExample(ClsExample example);

    int deleteByPrimaryKey(Integer cno);

    int insert(Cls record);

    int insertSelective(Cls record);

    List<Cls> selectByExample(ClsExample example);

    Cls selectByPrimaryKey(Integer cno);

    int updateByExampleSelective(@Param("record") Cls record, @Param("example") ClsExample example);

    int updateByExample(@Param("record") Cls record, @Param("example") ClsExample example);

    int updateByPrimaryKeySelective(Cls record);

    int updateByPrimaryKey(Cls record);
}
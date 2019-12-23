package com.woniu.cls.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.woniu.cls.entity.ClsExample;
import com.woniu.cls.entity.Cls;
import com.woniu.cls.mapper.ClsMapper;
import com.woniu.cls.service.ClsService;
@Service
public class ClsServiceImpl implements ClsService{

    @Resource
    private ClsMapper clsMapper;

    @Override
    public long countByExample(ClsExample example) {
        return clsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ClsExample example) {
        return clsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer cno) {
        return clsMapper.deleteByPrimaryKey(cno);
    }

    @Override
    public int insert(Cls record) {
        return clsMapper.insert(record);
    }

    @Override
    public int insertSelective(Cls record) {
        return clsMapper.insertSelective(record);
    }

    @Override
    public List<Cls> selectByExample(ClsExample example) {
        return clsMapper.selectByExample(example);
    }

    @Override
    public Cls selectByPrimaryKey(Integer cno) {
        return clsMapper.selectByPrimaryKey(cno);
    }

    @Override
    public int updateByExampleSelective(Cls record,ClsExample example) {
        return clsMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Cls record,ClsExample example) {
        return clsMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Cls record) {
        return clsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Cls record) {
        return clsMapper.updateByPrimaryKey(record);
    }

}

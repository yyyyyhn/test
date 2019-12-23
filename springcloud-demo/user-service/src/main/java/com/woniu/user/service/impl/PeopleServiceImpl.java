package com.woniu.user.service.impl;

import com.woniu.user.entity.People;
import com.woniu.user.entity.PeopleExample;
import com.woniu.user.mapper.PeopleMapper;
import com.woniu.user.service.PeopleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService{

    @Resource
    private PeopleMapper peopleMapper;

    @Override
    public long countByExample(PeopleExample example) {
        return peopleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PeopleExample example) {
        return peopleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return peopleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(People record) {
        return peopleMapper.insert(record);
    }

    @Override
    public int insertSelective(People record) {
        return peopleMapper.insertSelective(record);
    }

    @Override
    public List<People> selectByExample(PeopleExample example) {
        return peopleMapper.selectByExample(example);
    }

    @Override
    public People selectByPrimaryKey(Integer id) {
        return peopleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(People record,PeopleExample example) {
        return peopleMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(People record,PeopleExample example) {
        return peopleMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(People record) {
        return peopleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(People record) {
        return peopleMapper.updateByPrimaryKey(record);
    }

}

package com.example.demo.dao.impl;

import com.example.demo.dao.DemoDao;
import com.example.demo.entity.MemberInfo;
import com.example.demo.mapper.MemberInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 描述：${DESCRITION}
 * 创建人：liuyong@dianxiaohuo.net
 * 创建时间： 2019-02-24:16:53
 */
@Repository
public class DemoDaoImpl implements DemoDao {
    @Resource
    private MemberInfoMapper memberInfoMapper;
    @Override
    public String sayHi() {
        MemberInfo memberInfo = memberInfoMapper.selectByPrimaryKey(120708L);
        return "Hi"+(memberInfo==null?"":memberInfo.getMemName())+",This is Spring Boot Project";
    }
}

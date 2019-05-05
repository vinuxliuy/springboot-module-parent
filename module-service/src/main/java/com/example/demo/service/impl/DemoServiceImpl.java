package com.example.demo.service.impl;

import com.example.demo.dao.DemoDao;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：${DESCRITION}
 * 创建人：liuyong@dianxiaohuo.net
 * 创建时间： 2019-02-24:16:52
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoDao demoDao;

    @Override
    public String sayHi() {
        return demoDao.sayHi();
    }
}

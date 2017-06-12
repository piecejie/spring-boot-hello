package com.piecejie.service;

import com.piecejie.dao.DemoRepository;
import com.piecejie.entity.Demo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by with IntelliJ IDEA.
 * User: ${user}
 * Date: 2017/6/12
 * Time: 17:25
 * 提供Demo服务类
 */
@Service
public class DemoService {
    @Resource
    private DemoRepository demoRepository;

    @Transactional//事物注解
    public void save(Demo demo) {
        demoRepository.save(demo);
    }
}

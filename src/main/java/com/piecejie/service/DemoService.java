package com.piecejie.service;

import com.piecejie.dao.DemoDao;
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

    @Resource
    private DemoDao demoDao;

    /**
     * 保存demo 通过jpa
     *
     * @param demo
     */
    @Transactional//事物注解
    public void save(Demo demo) {
        demoRepository.save(demo);
    }

    /**
     * 通过id获取Demo
     *
     * @param id
     * @return
     */
    public Demo getById(long id) {
        //return demoRepository.findOne(id);
        return demoDao.getById(id);
    }
}

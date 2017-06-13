package com.piecejie.dao;

import com.piecejie.entity.Demo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by with IntelliJ IDEA.
 * User: ${user}
 * Date: 2017/6/13
 * Time: 16:05
 * 使用JdbcTemplate操作数据库.
 */
@Repository
public class DemoDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Demo getById(long id) {
        String sql = "select * from Demo where id=?";
        RowMapper<Demo> demoRowMapper = new BeanPropertyRowMapper<Demo>(Demo.class);
        return jdbcTemplate.queryForObject(sql, demoRowMapper, id);
    }
}

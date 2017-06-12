package com.piecejie.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by with IntelliJ IDEA.
 * User:J
 * Date: 2017/6/12
 * Time: 16:19
 * 测试实体类
 */
@Entity//加入这个注解，Demo就会进行持久化了
public class Demo {
    //标注用于声明一个实体类的属性映射为数据库的主键列。该属性通常置于属性声明语句之前，可与声明语句同行，也可写在单独行上
    @Id
    //用于标注主键的生成策略,通过strategy属性指定。
    // 默认情况下,JPA自动选择一个最适合底层数据库的主键生成策略:SqlServer对应identity,MySQL对应auto increment。
    @GeneratedValue

    private long id;//主键
    private String name;//测试名称

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

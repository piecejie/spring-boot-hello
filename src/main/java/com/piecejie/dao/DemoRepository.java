package com.piecejie.dao;

import com.piecejie.entity.Demo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by with IntelliJ IDEA.
 * User: ${user}
 * Date: 2017/6/12
 * Time: 17:23
 * 这是一个接口，没有具体的实现，就是JPA
 */
public interface DemoRepository extends CrudRepository<Demo, Long> {
    /**
     * CrudRepository类把一些常用的方法都已经进行定义和实现了。那么你现在就可以在别的类引入调用了。
     */
    /**
     * Spring Data的核心接口里面Repository是最基本的接口, spring提供了很多实现了该接口的基本接口.
     *如:CrudRepository，PagingAndSortingRepository，SimpleJpaRepository，QueryDslJpaRepository等大量查询接口
     */
}

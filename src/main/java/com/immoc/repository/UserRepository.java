package com.immoc.repository;

import com.immoc.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by huangshan11 on 2018/7/12.
 */
public interface UserRepository extends CrudRepository<User,Long> {
}

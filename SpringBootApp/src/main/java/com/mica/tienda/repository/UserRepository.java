package com.mica.tienda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mica.tienda.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}

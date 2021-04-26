package com.mica.tienda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mica.tienda.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}

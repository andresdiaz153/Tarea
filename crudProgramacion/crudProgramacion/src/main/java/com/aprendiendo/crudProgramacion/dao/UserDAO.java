package com.aprendiendo.crudProgramacion.dao;

import com.aprendiendo.crudProgramacion.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UsersEntity, Integer> {
}

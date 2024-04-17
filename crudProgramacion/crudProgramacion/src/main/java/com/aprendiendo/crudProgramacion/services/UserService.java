package com.aprendiendo.crudProgramacion.services;

import com.aprendiendo.crudProgramacion.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO saveUser(UserDTO userDTO);

    List<UserDTO> getUsers();
}

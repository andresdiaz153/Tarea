package com.aprendiendo.crudProgramacion.controllers;

import com.aprendiendo.crudProgramacion.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    public ResponseEntity<UserDTO>saveUserController(UserDTO obj)  {
        return ResponseEntity.ok(userService.saveUser(obj));
    }
}

package org.example.userservice.controllers;


import org.example.userservice.dtos.CreateRoleRequestDto;
import org.example.userservice.models.Role;
import org.example.userservice.services.RoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {
private RoleService roleService;
public RoleController(RoleService roleService) {
this.roleService = roleService;
}

    @PostMapping
    public ResponseEntity<Role> createRole(CreateRoleRequestDto request) {
        Role role = roleService.createRole(request.getName());
        return new ResponseEntity<>(role, HttpStatus.OK);
    }
}

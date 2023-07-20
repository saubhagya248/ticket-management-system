package com.carvia.ticketsystem.web.controller;

import com.carvia.ticketsystem.dto.UserRequest;
import com.carvia.ticketsystem.dto.UserResponse;
import com.carvia.ticketsystem.exception.ApplicationException;
import com.carvia.ticketsystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/public")
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<UserResponse> addUser(@RequestBody UserRequest userRequest){
        try{
            UserResponse response = userService.createUser(userRequest);
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (ApplicationException e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}

package com.carvia.ticketsystem.service;

import com.carvia.ticketsystem.dto.UserRequest;
import com.carvia.ticketsystem.dto.UserResponse;

public interface UserService {
    public UserResponse createUser(UserRequest userRequest);
}

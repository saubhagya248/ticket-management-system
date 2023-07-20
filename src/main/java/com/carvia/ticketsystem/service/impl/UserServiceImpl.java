package com.carvia.ticketsystem.service.impl;

import com.carvia.ticketsystem.converter.UserTransformer;
import com.carvia.ticketsystem.dto.UserRequest;
import com.carvia.ticketsystem.dto.UserResponse;
import com.carvia.ticketsystem.exception.ApplicationException;
import com.carvia.ticketsystem.model.User;
import com.carvia.ticketsystem.repository.UserRepository;
import com.carvia.ticketsystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContextException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public UserResponse createUser(UserRequest userRequest) {

        Optional<User> userOptional = repository.findByMobile(userRequest.getMobile());

        if(userOptional.isPresent()) throw new ApplicationException("User with same mobile already exists");

        User user = repository.save(UserTransformer.userRequestToUser(userRequest));

        return UserTransformer.userToUserResponse(user);
    }
}

package com.carvia.ticketsystem.converter;

import com.carvia.ticketsystem.dto.UserRequest;
import com.carvia.ticketsystem.dto.UserResponse;
import com.carvia.ticketsystem.model.User;

public class UserTransformer {
    public static User userRequestToUser(UserRequest request){
        return User.builder()
                .name(request.getName())
                .mobile(request.getMobile())
                .email(request.getEmail())
                .role(request.getRole())
                .build();
    }

    public static UserResponse userToUserResponse(User user){
        return UserResponse.builder()
                .name(user.getName())
                .mobile(user.getMobile())
                .role(user.getRole())
                .build();
    }
}

package com.carvia.ticketsystem.dto;

import com.carvia.ticketsystem.enums.Role;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    String name;
    String mobile;
    Role role;

}

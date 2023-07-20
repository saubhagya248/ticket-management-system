package com.carvia.ticketsystem.dto;

import com.carvia.ticketsystem.enums.Status;
import com.carvia.ticketsystem.model.Resource;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TicketResponse {

    Instant createdOn;

    Instant updatedOn;

    Status status;

    UserResponse user;

    ResourceResponse resource;
}

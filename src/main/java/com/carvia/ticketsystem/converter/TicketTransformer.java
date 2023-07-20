package com.carvia.ticketsystem.converter;

import com.carvia.ticketsystem.dto.TicketResponse;
import com.carvia.ticketsystem.model.Ticket;

public class TicketTransformer {
    public static TicketResponse ticketToTicketResponse(Ticket ticket){
        return TicketResponse.builder()
                .status(ticket.getStatus())
                .createdOn(ticket.getCreatedOn())
                .updatedOn(ticket.getUpdatedOn())
                .user(UserTransformer.userToUserResponse(ticket.getUser()))
                .resource(ResourceTransformer.resourceToResourceResponse(ticket.getResource()))
                .build();
    }
}

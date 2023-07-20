package com.carvia.ticketsystem.service;

import com.carvia.ticketsystem.dto.TicketRequest;
import com.carvia.ticketsystem.dto.TicketResponse;
import com.carvia.ticketsystem.dto.UserRequest;
import com.carvia.ticketsystem.exception.ApplicationException;

public interface TicketService {
    public TicketResponse createTicket(TicketRequest request) throws ApplicationException;
}

package com.carvia.ticketsystem.service.impl;

import com.carvia.ticketsystem.converter.TicketTransformer;
import com.carvia.ticketsystem.dto.TicketRequest;
import com.carvia.ticketsystem.dto.TicketResponse;
import com.carvia.ticketsystem.dto.UserRequest;
import com.carvia.ticketsystem.enums.Status;
import com.carvia.ticketsystem.exception.ApplicationException;
import com.carvia.ticketsystem.model.Resource;
import com.carvia.ticketsystem.model.Ticket;
import com.carvia.ticketsystem.model.User;
import com.carvia.ticketsystem.repository.ResourceRepository;
import com.carvia.ticketsystem.repository.TicketRepository;
import com.carvia.ticketsystem.repository.UserRepository;
import com.carvia.ticketsystem.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final UserRepository userRepository;

    private final ResourceRepository resourceRepository;

    private final TicketRepository ticketRepository;

    @Override
    public TicketResponse createTicket(TicketRequest request) throws ApplicationException{

        Optional<User> userOptional = userRepository.findByMobile(request.getUser().getMobile());

        if(userOptional.isEmpty()) throw new ApplicationException("User with given mobile does not exist!!");

        Optional<Resource> resourceOptional = resourceRepository.findByName(request.getResourceName());

        if(resourceOptional.isEmpty()) throw new ApplicationException("Resource with given name not found!!");

        Ticket ticket = Ticket.builder()
                .user(userOptional.get())
                .status(Status.UNDER_REVIEW)
                .resource(resourceOptional.get())
                .build();

        return TicketTransformer.ticketToTicketResponse(ticketRepository.save(ticket));
    }
}

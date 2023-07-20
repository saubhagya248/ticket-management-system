package com.carvia.ticketsystem.web.controller;

import com.carvia.ticketsystem.dto.TicketRequest;
import com.carvia.ticketsystem.dto.TicketResponse;
import com.carvia.ticketsystem.dto.UserRequest;
import com.carvia.ticketsystem.exception.ApplicationException;
import com.carvia.ticketsystem.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
@RequiredArgsConstructor
public class TicketController {

    private final TicketService ticketService;

    @PostMapping("/ticket")
    public ResponseEntity createTicket(@RequestBody TicketRequest ticketRequest){
        try{
            TicketResponse response = ticketService.createTicket(ticketRequest);
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (ApplicationException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}

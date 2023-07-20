package com.carvia.ticketsystem.service;

import com.carvia.ticketsystem.enums.Role;
import com.carvia.ticketsystem.enums.Status;
import com.carvia.ticketsystem.model.Ticket;
import com.carvia.ticketsystem.model.User;
import com.carvia.ticketsystem.repository.TicketRepository;
import com.carvia.ticketsystem.repository.UserRepository;
import com.carvia.ticketsystem.util.TaskUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskAssignService {

    private final TicketRepository ticketRepository;
    private final UserRepository userRepository;

//    @Scheduled(fixedDelay = 10000)
    void initialAssigner(){
//        System.out.println("Assigning the tickets to respective users!!!");
//
//        List<Ticket> ticketList =  ticketRepository.findAllByStatus(Status.CREATED.toString());
//        List<User> userList = userRepository.findAllByRole(Role.REQUEST_MANAGER.toString());
//
//        ticketRepository.saveAll(finalTicketList);
    }
}

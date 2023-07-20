package com.carvia.ticketsystem.repository;

import com.carvia.ticketsystem.enums.Status;
import com.carvia.ticketsystem.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,String> {

    public List<Ticket> findAllByStatus(String status);
}

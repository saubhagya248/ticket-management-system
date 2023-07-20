package com.carvia.ticketsystem.repository;

import com.carvia.ticketsystem.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResourceRepository extends JpaRepository<Resource,String> {

    public Optional<Resource> findByName(String name);
}

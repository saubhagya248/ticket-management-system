package com.carvia.ticketsystem.repository;

import com.carvia.ticketsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    public Optional<User> findByMobile(String mobile);
    public List<User> findAllByRole(String role);
}

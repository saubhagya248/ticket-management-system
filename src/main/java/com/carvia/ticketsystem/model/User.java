package com.carvia.ticketsystem.model;

import com.carvia.ticketsystem.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    String Id;

    @Column(name = "name")
    String name;

    @Column(name = "mobile", unique = true, nullable = false)
    String mobile;

    @Column(name = "email", unique = true, nullable = false)
    String email;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    Role role;

    @OneToMany(mappedBy = "user")
    List<Ticket> tickets = new ArrayList<>();
}

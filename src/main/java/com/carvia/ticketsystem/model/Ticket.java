package com.carvia.ticketsystem.model;

import com.carvia.ticketsystem.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    String id;

    @Column(name = "created_on")
    @CreationTimestamp
    Instant createdOn;

    @Column(name = "updated_on")
    @UpdateTimestamp
    Instant updatedOn;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    Resource resource;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    Status status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    User user;

    @ManyToOne
    User assignedTo;

}

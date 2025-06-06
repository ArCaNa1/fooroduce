package com.fooroduce.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "vote")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer voteId;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "truck_id")
    private Truck truck;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String fingerprint;
    private String votedAt;
}

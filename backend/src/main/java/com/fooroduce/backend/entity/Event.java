package com.fooroduce.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "event")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer event_id;

    private String event_name;
    private String event_host;
    private String event_image;

    private String event_start;
    private String event_end;

    @Lob
    private String description;

    private Integer truck_count;

    private String recruit_start;
    private String recruit_end;
    private String vote_start;
    private String vote_end;

    private String location;

    private Double latitude;
    private Double longitude;

    private Integer createdBy;
    private String createdAt;
}

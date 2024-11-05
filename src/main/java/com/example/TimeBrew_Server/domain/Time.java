package com.example.TimeBrew_Server.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Time")
@Getter
@Setter
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long timeId;

    @JoinColumn(name = "vibratingbell_id")
    private int vibratingBell;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "time")
    private LocalTime time;
}
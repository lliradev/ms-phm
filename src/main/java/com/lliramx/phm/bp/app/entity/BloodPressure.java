package com.lliramx.phm.bp.app.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@Entity
public class BloodPressure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "sys")
    private Integer sys;
    @Column(name = "dia")
    private Integer dia;
    @Column(name = "pulse")
    private Integer pulse;
    @Column(name = "type")
    private String type;
    @Column(name = "person_id")
    private Long personId;
    @Column(name = "feeling")
    private String feeling;
    @Column(name = "note")
    private String note;
    @Column(name = "created_at")
    private OffsetDateTime createdAt;
}

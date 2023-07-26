package com.lliramx.phm.bp.app.entity;

import java.time.OffsetDateTime;

public class BloodPressure {
    private Long id;
    private Integer sys;
    private Integer dia;
    private Integer pulse;
    private String type;
    private Long personId;
    private String feeling;
    private String note;
    private OffsetDateTime createdAt;
}

package com.lliramx.phm.bp.app.domain;

public record BloodPressureEntry(Integer sys, Integer dia, Integer pulse, String type, Long personId,
                                 String feeling, String note) {
}

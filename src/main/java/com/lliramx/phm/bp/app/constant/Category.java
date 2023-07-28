package com.lliramx.phm.bp.app.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@RequiredArgsConstructor
@Getter
@Accessors(fluent = true)
public enum Category {
    DOWN("Baja"),
    NORMAL("Normal"),
    HIGH("Elevada"),
    HIGH_LEVEL_ONE("Presión arterial alta (Hipertensión) Nivel 1"),
    HIGH_LEVEL_TWO("Presión arterial alta (Hipertensión) Nivel 2"),
    CRISIS("Crisis de hipertensión"),
    ERROR("Categoría no encontrada");

    private final String category;
}

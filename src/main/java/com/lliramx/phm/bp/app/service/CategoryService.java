package com.lliramx.phm.bp.app.service;

import com.lliramx.phm.bp.app.constant.Category;
import com.lliramx.phm.bp.app.domain.CategoryEntry;
import com.lliramx.phm.bp.app.domain.CategoryResponse;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CategoryService {

    public CategoryResponse generateCategory(CategoryEntry entry) {
        if (entry.sys() <= 90 && entry.dia() <= 60)
            return new CategoryResponse(Category.DOWN.category());
        if (entry.sys() <= 120 && entry.dia() <= 80)
            return new CategoryResponse(Category.NORMAL.category());
        if (between(entry.sys(), 120, 129) && entry.dia() <= 80)
            return new CategoryResponse(Category.HIGH.category());
        if (between(entry.sys(), 130, 139) || between(entry.dia(), 80, 89))
            return new CategoryResponse(Category.HIGH_LEVEL_ONE.category());
        if (between(entry.sys(), 140, 179) || between(entry.dia(), 90, 119))
            return new CategoryResponse(Category.HIGH_LEVEL_TWO.category());
        if (entry.sys() >= 180 && entry.dia() >= 120)
            return new CategoryResponse(Category.CRISIS.category());
        if (entry.sys() >= 180 || entry.dia() >= 120)
            return new CategoryResponse(Category.CRISIS.category());
        return new CategoryResponse(Category.ERROR.category());
    }

    private boolean between(int compared, int min, int max) {
        return compared >= min && compared <= max;
    }
}

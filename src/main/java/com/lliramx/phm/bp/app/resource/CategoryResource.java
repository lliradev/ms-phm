package com.lliramx.phm.bp.app.resource;

import com.lliramx.phm.bp.app.domain.CategoryEntry;
import com.lliramx.phm.bp.app.service.CategoryService;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/api/v1/category")
public class CategoryResource {

    @Inject
    private CategoryService categoryService;

    @Path("/blood-pressure")
    @POST
    public Response generateCategory(CategoryEntry entry) {
        var response = categoryService.generateCategory(entry);
        return Response.ok(response).build();
    }
}

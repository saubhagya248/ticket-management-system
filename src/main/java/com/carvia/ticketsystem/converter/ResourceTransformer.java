package com.carvia.ticketsystem.converter;

import com.carvia.ticketsystem.dto.ResourceResponse;
import com.carvia.ticketsystem.model.Resource;

public class ResourceTransformer {
    public static ResourceResponse resourceToResourceResponse(Resource resource){
        return ResourceResponse.builder()
                .name(resource.getName())
                .build();
    }
}

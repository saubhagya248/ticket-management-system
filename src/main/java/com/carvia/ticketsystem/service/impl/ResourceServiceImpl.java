package com.carvia.ticketsystem.service.impl;

import com.carvia.ticketsystem.model.Resource;
import com.carvia.ticketsystem.repository.ResourceRepository;
import com.carvia.ticketsystem.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResourceServiceImpl implements ResourceService {


    private final ResourceRepository resourceRepository;

    @Override
    public Resource createResource(Resource resource) {
        return resourceRepository.save(resource);
    }
}

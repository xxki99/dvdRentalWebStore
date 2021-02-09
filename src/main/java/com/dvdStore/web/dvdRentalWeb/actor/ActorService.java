package com.dvdStore.web.dvdRentalWeb.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService {
    private final ActorRepository actorRepository;

    @Autowired
    public ActorService(ActorRepository actorRepository){
        this.actorRepository = actorRepository;
    }

    public List<ActorEntity> getAllActors(){
        return actorRepository.findAll();
    }

    public Optional<ActorEntity> getSingleActor(String id){
        return actorRepository.findById(Long.parseLong(id));
    }
}

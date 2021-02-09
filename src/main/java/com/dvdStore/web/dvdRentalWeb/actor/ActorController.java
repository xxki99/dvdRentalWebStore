package com.dvdStore.web.dvdRentalWeb.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/actor")
public class ActorController {
    private final ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService){
        this.actorService = actorService;
    }

    // list
    @GetMapping
    public List<ActorEntity> getAllActors(){
        return actorService.getAllActors();
    }

    // detail
    @GetMapping(path="/{id}")
    public ResponseEntity<ActorEntity> getSingleActor(@PathVariable String id){
        Optional<ActorEntity> actor = actorService.getSingleActor(id);

        if (actor.isPresent()){
            return ResponseEntity.ok().body(actor.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
}

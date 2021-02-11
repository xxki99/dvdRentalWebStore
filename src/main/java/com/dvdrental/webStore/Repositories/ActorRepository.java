package com.dvdrental.webStore.Repositories;

import com.dvdrental.webStore.Entities.Actor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Long> {
    
}

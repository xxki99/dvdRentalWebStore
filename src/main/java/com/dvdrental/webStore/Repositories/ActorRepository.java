package com.dvdrental.webStore.Repositories;

import com.dvdrental.webStore.Entities.ActorEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<ActorEntity, Long> {
    
}

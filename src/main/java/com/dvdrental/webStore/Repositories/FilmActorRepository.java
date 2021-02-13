package com.dvdrental.webStore.Repositories;

import com.dvdrental.webStore.Entities.FilmActor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmActorRepository extends JpaRepository<FilmActor, Integer>{
    
}

package com.dvdrental.webStore.Repositories;

import com.dvdrental.webStore.Entities.Film;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
    
}

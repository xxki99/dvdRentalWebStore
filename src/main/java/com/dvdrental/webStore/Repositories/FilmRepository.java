package com.dvdrental.webStore.Repositories;


import com.dvdrental.webStore.Entities.Film;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface FilmRepository extends JpaRepository<Film, Integer> {
    @Query("SELECT DISTINCT rating FROM Film")
    public String[] getAllRating();
    
}



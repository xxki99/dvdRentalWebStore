package com.dvdrental.webStore.Repositories;

import com.dvdrental.webStore.Entities.Film;
import com.dvdrental.webStore.Projections.CustomFilmListItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(excerptProjection = CustomFilmListItem.class)
public interface FilmRepository extends JpaRepository<Film, Integer> {
    @Query("SELECT DISTINCT rating FROM Film")
    public String[] getAllRating();
    
}



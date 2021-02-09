package com.dvdStore.web.dvdRentalWeb.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/film")
public class FilmController {
    public final FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<FilmListItemProjection> getAllFilms(){
        return filmService.getAllFilms();
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<FilmEntity> getSingleFilm(@PathVariable String id){
        Optional<FilmEntity> film = filmService.getSingleFilm(id);

        if (film.isPresent()){
            return ResponseEntity.ok().body(film.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(path="/q")
    public List<FilmEntity> getAllFilmsByLang(@RequestParam String lang){
        return filmService.getAllFilmsByLang(lang);
    }
}

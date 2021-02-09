package com.dvdStore.web.dvdRentalWeb.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {
    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository){
        this.filmRepository = filmRepository;
    }

    public List<FilmListItemProjection> getAllFilms(){
        return filmRepository.findAllProjectedBy();
    }

    public Optional<FilmEntity> getSingleFilm(String id){
        Optional<FilmEntity> film = filmRepository.findById(Long.parseLong(id));
        return film;
    }

    public List<FilmEntity> getAllFilmsByLang(String lang){

        return filmRepository.findByLanguageLanguageId(Integer.parseUnsignedInt(lang));
    }

}

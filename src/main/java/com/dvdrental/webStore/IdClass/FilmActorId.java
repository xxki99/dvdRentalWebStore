package com.dvdrental.webStore.IdClass;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FilmActorId implements Serializable {
    static final long serialVersionUID = 42L;

    @Column(name="actor_id")
    private Integer actorId;

    @Column(name="film_id")
    private Integer filmId;

    FilmActorId(){

    }

    public FilmActorId(Integer actorId, Integer filmId) {
        this.actorId = actorId;
        this.filmId = filmId;
    }

    // hash & equal

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == this.getClass()) {
            FilmActorId test = (FilmActorId) obj;
            if (test.actorId == this.actorId && test.filmId == this.filmId) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return actorId * 100000 + filmId;
    }
}

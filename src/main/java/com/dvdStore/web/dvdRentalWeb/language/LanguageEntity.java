package com.dvdStore.web.dvdRentalWeb.language;

import com.dvdStore.web.dvdRentalWeb.film.FilmEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.List;

@Entity
@Table(name = "language", schema = "public", catalog = "dvdrental")
public class LanguageEntity {

    @Id
    @Column(name = "language_id", nullable = false)
    @GeneratedValue
    private int languageId;

    @Basic
    @Column(name = "name", nullable = false, length = 20)
    private String name;


    @Basic
    @Column(name = "last_update", nullable = false)
    private Timestamp lastUpdate;



    @OneToMany(mappedBy = "language")
    private List<FilmEntity> films;


    
    public List<FilmEntity> getFilms() {
        return films;
    }
    public void setFilms(List<FilmEntity> films) {
        this.films = films;
    }



    
    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LanguageEntity that = (LanguageEntity) o;
        return languageId == that.languageId && Objects.equals(name, that.name) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(languageId, name, lastUpdate);
    }
}

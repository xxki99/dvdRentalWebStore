package com.dvdStore.web.dvdRentalWeb.film;

import com.dvdStore.web.dvdRentalWeb.language.LanguageEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "film", schema = "public", catalog = "dvdrental")
public class FilmEntity {

    @Id
    @GeneratedValue
    @Column(name = "film_id", nullable = false)
    private Long filmId;


    @Basic
    @Column(name = "title", nullable = false, length = 255)
    private String title;


    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;


    @Basic
    @Column(name = "release_year", nullable = true)
    private Integer releaseYear;


    @ManyToOne
    @JsonIgnoreProperties("films")
    @JoinColumn(name="language_id")
    private LanguageEntity language;


    @Basic
    @Column(name = "rental_duration", nullable = false)
    private short rentalDuration;


    @Basic
    @Column(name = "rental_rate", nullable = false, precision = 2)
    private BigDecimal rentalRate;


    @Basic
    @Column(name = "length", nullable = true)
    private Short length;


    @Basic
    @Column(name = "replacement_cost", nullable = false, precision = 2)
    private BigDecimal replacementCost;


    @Basic
    @Column(name = "rating", nullable = true)
    private String rating;


    @Basic
    @Column(name = "last_update", nullable = false)
    private Timestamp lastUpdate;


    @Basic
    @Column(name = "special_features", nullable = true, length = -1)
    private String specialFeatures;


    @Basic
    @Column(name = "fulltext", nullable = false)
    private String fulltext;

    

    
    public Long getFilmId() {
        return filmId;
    }
    public void setFilmId(Long filmId){
        this.filmId = filmId;
    }


    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    
    public LanguageEntity getLanguage() {
        return language;
    }
    public void setLanguage(LanguageEntity language){
        this.language = language;
    }


    
    public short getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(short rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    
    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    
    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    
    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    
    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    
    public String getFulltext() {
        return fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmEntity that = (FilmEntity) o;
        return filmId == that.filmId && language == that.language && rentalDuration == that.rentalDuration && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(releaseYear, that.releaseYear) && Objects.equals(rentalRate, that.rentalRate) && Objects.equals(length, that.length) && Objects.equals(replacementCost, that.replacementCost) && Objects.equals(rating, that.rating) && Objects.equals(lastUpdate, that.lastUpdate) && Objects.equals(specialFeatures, that.specialFeatures) && Objects.equals(fulltext, that.fulltext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, title, description, releaseYear, language, rentalDuration, rentalRate, length, replacementCost, rating, lastUpdate, specialFeatures, fulltext);
    }
}

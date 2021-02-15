package com.dvdrental.webStore.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="film")
public class Film {
    @Id
    @GeneratedValue
    @Column(name="film_id")
    private Integer filmId;

    @Column(name="title")
    private String title;

    

    @Column(name="description")
    private String description;

    

    @Column(name="release_year")
    private Long releaseYear;

    @ManyToOne
    @JoinColumn(name="language_id")
    private Language language;

    @Column(name="rental_duration")
    private Integer rentalDuration;

    @Column(name="length")
    private Integer length;

    @Column(name="replacementCost")
    private float replacementCost;

    @Column(name="rating")
    private String rating;

    @Column(name="special_features")
    private String specialFeatures;

    @Column(name="fulltext")
    private String fulltext;

    @ManyToMany(mappedBy = "films")
    private List<Actor>  actors;


    public float getReplacementCost() {
        return this.replacementCost;
    }

    public void setReplacementCost(float replacementCost) {
        this.replacementCost = replacementCost;
    }


	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}



    public String getSpecialFeatures() {
        return this.specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }


    public String getFulltext() {
        return this.fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }    

    

    public Integer getFilmId() {
		return this.filmId;
	}

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(Long releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Language getLanguage() {
        return this.language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Integer getRentalDuration() {
        return this.rentalDuration;
    }

    public void setRentalDuration(Integer rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public Integer getLength() {
        return this.length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @JsonIgnore
    public String[] getFilmsActorsName(){

        int size = (this.actors.size() <= 3)? this.actors.size() : 3;
        String[] returnValue = new String[size];
        for (int i = 0; i < size; i++){
            returnValue[i] = this.actors.get(i).getFullName();

        }
        return returnValue;
    }

}

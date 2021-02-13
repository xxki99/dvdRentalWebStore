package com.dvdrental.webStore.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue
    @Column(name = "actor_id")
    private Integer actorId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToMany
    @JoinTable(name = "film_actor", joinColumns = @JoinColumn(name = "actor_id"), inverseJoinColumns = @JoinColumn(name = "film_id"))
    List<Film> films;

    // id
    public Integer getActorId() {
        return this.actorId;
    }

    // first name
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // last name
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonIgnore
    public String[] getFilmsSubsetTitle() {
        int sizeUpper = 5;
        boolean isExtra = (films.size() > sizeUpper);
        int size = isExtra ? sizeUpper + 1 : films.size();
        String[] returnValue = new String[size];
        for (int i = 0; i < size; i++) {
            if (isExtra && i == size - 1) {

                returnValue[i] = "...";
            } else {

                returnValue[i] = this.films.get(i).getTitle();
            }
        }
        return returnValue;
    }

}

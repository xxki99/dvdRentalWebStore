package com.dvdrental.webStore.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="language")
public class Language {
    @Id
    @GeneratedValue
    @Column(name="language_id")
    private Long languageId;

    @Column(name="name")
    private String name;

    

    public Long getLanguageId() {
        return this.languageId;
    }

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

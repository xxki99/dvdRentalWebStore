package com.dvdrental.webStore.Repositories;

import com.dvdrental.webStore.Entities.Language;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Long> {
    
}

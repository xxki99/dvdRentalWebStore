package com.dvdrental.webStore.Repositories;

import com.dvdrental.webStore.Entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
    @Query("SELECT DISTINCT name FROM Category")
    public String[] getAllName();
}

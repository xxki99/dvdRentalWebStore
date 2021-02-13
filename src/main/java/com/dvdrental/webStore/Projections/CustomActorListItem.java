package com.dvdrental.webStore.Projections;

import org.springframework.beans.factory.annotation.Value;

public interface CustomActorListItem {
    public String getFirstName();
    public String getLastName();

    @Value("#{target.getFilmsSubsetTitle()}")
    public String[] getFilmsSubsetTitle();
}

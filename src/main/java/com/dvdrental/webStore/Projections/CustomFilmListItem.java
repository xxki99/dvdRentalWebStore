package com.dvdrental.webStore.Projections;

import org.springframework.beans.factory.annotation.Value;

public interface CustomFilmListItem {
    public String getTitle();
    public String getRating();

    @Value("#{target.getFilmsActorsName()}")
    public String[] getFilmsActorsName();
}

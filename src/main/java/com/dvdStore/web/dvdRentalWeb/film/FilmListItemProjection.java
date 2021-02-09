package com.dvdStore.web.dvdRentalWeb.film;

import java.math.BigDecimal;

interface FilmListItemProjection {
    Long getFilmId();
    String getTitle();
    BigDecimal getRentalRate();
    String getRating();
}

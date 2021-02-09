package com.dvdStore.web.dvdRentalWeb.film;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FilmRepository extends JpaRepository<FilmEntity, Long> {
    List<FilmEntity> findByLanguageLanguageId(Integer id);

    List<FilmListItemProjection> findAllProjectedBy();
}

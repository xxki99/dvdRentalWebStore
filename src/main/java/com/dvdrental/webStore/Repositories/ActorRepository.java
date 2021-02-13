package com.dvdrental.webStore.Repositories;


import com.dvdrental.webStore.Entities.Actor;
import com.dvdrental.webStore.Projections.CustomActorListItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = CustomActorListItem.class)
public interface ActorRepository extends JpaRepository<Actor, Integer> {
}

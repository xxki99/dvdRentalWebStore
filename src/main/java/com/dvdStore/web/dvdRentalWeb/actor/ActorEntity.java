package com.dvdStore.web.dvdRentalWeb.actor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="actor")
public class ActorEntity {
    private long actorId;
    private String first_name;
    private String last_name;
    private Timestamp last_update;

    @Id
    @GeneratedValue
    @Column(name="actor_id", nullable = false)
    public long getActorId(){
        return actorId;
    }
    public void setActorId(long actor_id){
        this.actorId = actor_id;
    }


    @Column(name="first_name", nullable = false)
    public String getFirstName(){
        return first_name;
    }
    public void setFirstName(String first_name){
        this.first_name = first_name;
    }

    @Column(name="last_name", nullable = false)
    public String getLastName(){
        return last_name;
    }
    public void setLastName(String last_name){
        this.last_name = last_name;
    }

    @Column(name="last_update", nullable = false)
    public Timestamp getLastUpdate(){
        return last_update;
    }
    public void setLastUpdate(Timestamp last_update){
        this.last_update = last_update;
    }

}

package org.example.recipe;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Tag {
    @Id
    @GeneratedValue
    long id;

    String name;

    public Tag(){

    }

    public long getId() {
        return id;
    }
}



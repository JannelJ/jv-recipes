package org.example.recipe;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Tag {
    @Id
    @GeneratedValue
    Long id;

    String name;

    public Tag(String name) {
        this.name = name;
    }

    public Tag(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



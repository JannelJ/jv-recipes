package org.example.recipeobjects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Tag {
    @Id
    @GeneratedValue
    long id;

    String name;

}

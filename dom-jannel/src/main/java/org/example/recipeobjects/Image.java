package org.example.recipeobjects;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Image {

    @Id
    @GeneratedValue
    long id;

    String fileName;
    String fileData;
    String associatedRecipe;

}

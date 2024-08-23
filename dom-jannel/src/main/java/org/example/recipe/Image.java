package org.example.recipe;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Image {

    @Id
    @GeneratedValue
    long id;

    String fileName;
    String fileData;

    @ManyToOne
    String associatedRecipe;

}

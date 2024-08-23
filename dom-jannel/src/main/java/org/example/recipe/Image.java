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
    Recipe associatedRecipe;

    public Image(String fileName, String fileData, Recipe associatedRecipe) {
        this.fileName = fileName;
        this.fileData = fileData;
        this.associatedRecipe = associatedRecipe;
    }

    public Image() {
    }

    public long getId() {
        return id;
    }
}

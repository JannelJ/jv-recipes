package org.example.recipe;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Image {

    @Id
    @GeneratedValue
    Long id;

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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileData() {
        return fileData;
    }

    public void setFileData(String fileData) {
        this.fileData = fileData;
    }

    public Recipe getAssociatedRecipe() {
        return associatedRecipe;
    }

    public void setAssociatedRecipe(Recipe associatedRecipe) {
        this.associatedRecipe = associatedRecipe;
    }
}

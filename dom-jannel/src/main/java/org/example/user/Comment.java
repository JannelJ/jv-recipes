package org.example.user;

import jakarta.persistence.*;
import org.example.recipe.Recipe;

import java.util.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    Long id;

    String text;

    @Temporal(TemporalType.TIMESTAMP)
    Date datePosted;

    @ManyToOne
    User author;

    @ManyToOne
    Recipe associatedRecipe;

    public Comment(String text, Date datePosted, User author, Recipe associatedRecipe) {
        this.text = text;
        this.datePosted = new Date();
        this.author = author;
        this.associatedRecipe = associatedRecipe;
    }

    public Comment(){
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = new Date();
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Recipe getAssociatedRecipe() {
        return associatedRecipe;
    }

    public void setAssociatedRecipe(Recipe associatedRecipe) {
        this.associatedRecipe = associatedRecipe;
    }
}

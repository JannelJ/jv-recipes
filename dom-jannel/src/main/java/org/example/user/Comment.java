package org.example.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.example.recipe.Recipe;

import java.sql.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    long id;

    String text;
    Date datePosted;

    @ManyToOne
    User author;

    @ManyToOne
    Recipe associatedRecipe;

    public Comment(){

    }

    public long getId() {
        return id;
    }
}

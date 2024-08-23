package org.example.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.example.recipeobjects.Recipe;

import java.sql.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    long id;

    String text;
    Date datePosted;
    User author;
    Recipe associatedRecipe;

}

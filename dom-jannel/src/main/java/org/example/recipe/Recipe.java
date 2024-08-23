package org.example.recipe;


import jakarta.persistence.*;
import org.example.user.User;

import java.sql.Date;
import java.util.List;


@Entity
public class Recipe {
    @Id
    @GeneratedValue
    long id;

    String title;
    String instructions;
    String preparationTime;
    String cookingTime;
    int servings;

    @Enumerated(EnumType.STRING)
    DifficultyLevel difficultyLevel;

    int rating;
    List<Ingredient> listOfIngredients;
    List<Category> listOfCategories;

    @ManyToOne
    User creator;

    Date dateCreated;
    Date lastModified;

    public Recipe(String title, String instructions, String preparationTime, String cookingTime, int servings, DifficultyLevel difficultyLevel, List<Ingredient> listOfIngredients, List<Category> listOfCategories, User creator) {
        this.title = title;
        this.instructions = instructions;
        this.preparationTime = preparationTime;
        this.cookingTime = cookingTime;
        this.servings = servings;
        this.difficultyLevel = difficultyLevel;
        this.listOfIngredients = listOfIngredients;
        this.listOfCategories = listOfCategories;
        this.creator = creator;
    }

    public Recipe(){

    }

    public long getId() {
        return id;
    }
}

package org.example.recipeobjects;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
    int difficultyLevel;
    int rating;
    List<Ingredient> listOfIngredients;
    List<Category> listOfCategories;
    User creator;
    Date dateCreated;
    Date lastModified;


}

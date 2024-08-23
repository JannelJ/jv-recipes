package org.example.user;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.example.recipeobjects.Recipe;
import org.hibernate.mapping.Value;

import java.sql.Date;

@Entity
public class Rating {
    @Id
    @GeneratedValue
    long id;

    int value;
    Date date;
    Recipe associatedRecipe;
    User rater;


}

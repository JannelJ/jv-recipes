package org.example.user;


import jakarta.persistence.*;
import org.example.recipe.Recipe;

import java.sql.Date;

@Entity
public class Rating {
    @Id
    @GeneratedValue
    long id;

    int value;
    Date date;

    @OneToOne
    Recipe associatedRecipe;

    @ManyToOne
    User rater;


}

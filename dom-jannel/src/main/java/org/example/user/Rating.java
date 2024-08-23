package org.example.user;


import jakarta.persistence.*;
import org.example.recipe.Recipe;
import java.util.Date;

@Entity
public class Rating {
    @Id
    @GeneratedValue
    Long id;

    int value;

    @Temporal(TemporalType.TIMESTAMP)
    Date date;

    @OneToOne
    Recipe associatedRecipe;

    @ManyToOne
    User rater;

    public Rating(int value, Date date, Recipe associatedRecipe, User rater) {
        this.value = value;
        this.date = date;
        this.associatedRecipe = associatedRecipe;
        this.rater = rater;
    }

    public Rating() {}

    public long getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = new Date();
    }

    public Recipe getAssociatedRecipe() {
        return associatedRecipe;
    }

    public void setAssociatedRecipe(Recipe associatedRecipe) {
        this.associatedRecipe = associatedRecipe;
    }

    public User getRater() {
        return rater;
    }

    public void setRater(User rater) {
        this.rater = rater;
    }
}

package org.example.seeddata;

import org.example.recipe.*;
import org.example.user.User;

import java.util.ArrayList;
import java.util.List;

public class RandomData {
    public static Ingredient tofu = new Ingredient("tofu", 75, UnitOfMeasurement.GRAMS);
    public static Category asian = new Category("asian");
    public static User jannel = new User("jannel", "jannel@gmail.com",
            "jannel123", true);

    public static Ingredient mushroom = new Ingredient("mushroom", 100, UnitOfMeasurement.GRAMS);
    public static Recipe soup = new Recipe("Soup", "How to make Soup", "10 mins",
            "15 mins", 1, DifficultyLevel.EASY, new ArrayList<>(List.of(tofu)),
            new ArrayList<>(List.of(asian)), jannel);

}

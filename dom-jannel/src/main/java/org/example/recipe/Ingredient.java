package org.example.recipe;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Ingredient {
        @Id
        @GeneratedValue
        long id;

        String name;
        int quantity;
        UnitOfMeasurement unitOfMeasurement;

    }


package org.example.recipe;


import jakarta.persistence.*;

@Entity
public class Ingredient {
        @Id
        @GeneratedValue
        long id;

        String name;
        int quantity;

        @Enumerated(EnumType.STRING)
        UnitOfMeasurement unitOfMeasurement;

        public Ingredient(String name, int quantity, UnitOfMeasurement unitOfMeasurement) {
                this.name = name;
                this.quantity = quantity;
                this.unitOfMeasurement = unitOfMeasurement;
        }

        public Ingredient() {}
}


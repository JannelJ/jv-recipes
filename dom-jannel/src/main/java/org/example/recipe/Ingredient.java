package org.example.recipe;


import jakarta.persistence.*;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue
    Long id;

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

    public long getId() {
            return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public UnitOfMeasurement getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(UnitOfMeasurement unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }
}


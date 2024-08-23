package org.example.recipe;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Category {
        @Id
        @GeneratedValue
        long id;

        String name;

        public Category(String name) {
                this.name = name;
        }

        public Category() {}
}


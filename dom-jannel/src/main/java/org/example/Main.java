package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.relational.SchemaManager;
import static org.example.Database.seedRecipes;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = Database.getSessionFactory();
        SchemaManager schemaManager = sessionFactory.getSchemaManager();
        schemaManager.exportMappedObjects(true);
        seedRecipes();

    }
}
package org.example;

import org.example.recipe.*;
import org.example.seeddata.RandomData;
import org.example.user.Comment;
import org.example.user.Rating;
import org.example.user.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.JdbcSettings.*;

public class Database {

    public static SessionFactory getSessionFactory(){
        var sessionFactory = new Configuration()
                // use H2 in-memory database
                .setProperty(URL, "jdbc:h2:mem:db1")
                // default username / password
                .setProperty(USER, "SA")
                .setProperty(PASS, "")
                // options to display SQL in console
                .setProperty(SHOW_SQL, TRUE.toString())
                .setProperty(FORMAT_SQL, TRUE.toString())
                .setProperty(HIGHLIGHT_SQL, TRUE.toString())
                .setProperty("hibernate.agroal.maxSize", "20")
                .addAnnotatedClass(Category.class)
//                .addAnnotatedClass(Image.class)
//                .addAnnotatedClass(Ingredient.class)
//                .addAnnotatedClass(Recipe.class)
//                .addAnnotatedClass(Tag.class)
//                .addAnnotatedClass(Comment.class)
//                .addAnnotatedClass(Rating.class)
//                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        return sessionFactory;
    }

    static void seedRecipes() {
        var sessionFactory = getSessionFactory();
        sessionFactory.inTransaction(session -> {
            session.persist(new Category("Spicy"));
//            session.persist(new Image("asdkjnasd", "asdlkna", RandomData.soup));
            session.flush();
//            session.persist(RandomData.mushroom);
//            System.out.println("Mushroom added");
//            session.persist(RandomData.soup);
//            System.out.println("Soup added");
//            session.flush();
//            System.out.println("Session flushed");
//            session.refresh(RandomData.soup);
//            System.out.println("Getting soup id");
//            System.out.println(RandomData.soup.getId());
        });
    }
}
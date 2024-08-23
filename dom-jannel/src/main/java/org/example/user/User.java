package org.example.user;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class User {
    @Id
    @GeneratedValue
    long id;

    String name;
    String email;
    String password;
    boolean isAdmin;
    Date date;
}

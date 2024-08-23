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
    boolean hasAdminPrivileges;
    Date dateRegistered;

    public User(String name, String email, String password, boolean hasAdminPrivileges) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.hasAdminPrivileges = hasAdminPrivileges;
    }

    public User(){

    }

    public long getId() {
        return id;
    }
}

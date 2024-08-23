package org.example.user;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue
    Long id;

    String name;
    String email;
    String password;
    boolean hasAdminPrivileges;

    @Temporal(TemporalType.TIMESTAMP)
    Date dateRegistered;

    public User(String name, String email, String password, boolean hasAdminPrivileges) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.hasAdminPrivileges = hasAdminPrivileges;
        this.dateRegistered = new Date();
    }

    public User(){}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isHasAdminPrivileges() {
        return hasAdminPrivileges;
    }

    public void setHasAdminPrivileges(boolean hasAdminPrivileges) {
        this.hasAdminPrivileges = hasAdminPrivileges;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = new Date();
    }
}

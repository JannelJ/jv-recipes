package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jdk.jfr.Name;


@Entity
public class Tag {
    @Id
    @GeneratedValue
    long id;
    String name;

}

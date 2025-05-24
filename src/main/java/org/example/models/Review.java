package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Review {

    @Id  // makes the field as primary key in our DB table
    Long id;


}

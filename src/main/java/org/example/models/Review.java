package org.example.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name = "bookingReview") //custom name for the table
public class Review {

    @Id  // makes the field as primary key in our DB table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB auto increments the ID
    Long id;

    @Column(nullable = false)
    String Content;

    double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // decides the format of date stored
    @CreatedDate // tells the spring to add value when created
    Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate // tells the spring to add value when updated
    Date updatedAt;
}

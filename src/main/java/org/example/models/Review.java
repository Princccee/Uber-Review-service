package org.example.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "bookingReview") //custom name for the table
public class Review {

    @Id  // makes the field as primary key in our DB table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB auto increments the ID
    private Long id;

    @Column(nullable = false)
    private String Content;

    private double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // decides the format of date stored
    @CreatedDate // tells the spring to add value when created
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate // tells the spring to add value when updated
    private Date updatedAt;

    @Override
    public String toString(){
        return "Review: " + this.Content + " " + this.rating+ " " + this.createdAt;
    }
}

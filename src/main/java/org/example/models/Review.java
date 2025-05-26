package org.example.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookingReview") //custom name for the table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Review extends baseModel{

    @Column(nullable = false)
    private String Content;

    private double rating;

    @Override
    public String toString(){
        return "Review: " + this.Content + " " + this.rating + " " + this.createdAt;
    }
}

package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class passengerReview extends Review{
    @Column(nullable = false)
    private String passengerReviewComment;

    @Column(nullable = false)
    private double passengerRating;
}

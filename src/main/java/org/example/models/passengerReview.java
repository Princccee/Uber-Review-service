package org.example.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class passengerReview extends Review{
    private String passengerReviewComment;
}

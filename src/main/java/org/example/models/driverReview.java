package org.example.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class driverReview extends Review{
    private String driverReviewComment;
}

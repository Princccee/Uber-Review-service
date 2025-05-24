package org.example.services;

import lombok.Setter;
import org.example.models.Review;
import org.example.repositories.reviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class reviewService implements CommandLineRunner {

    @Autowired
    private reviewRepository reviewRepo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("***********************");

        Review r = Review.builder()
                .Content("Amazing Ride")
                .createdAt(new Date())
                .updatedAt(new Date())
                .rating(4.5)
                .build();

        System.out.println(r.toString());
        reviewRepo.save(r); //execute the sql to insert an entry in the table

    }
}

package org.example.services;


import org.example.models.Booking;
import org.example.models.Review;
import org.example.repositories.bookingRepository;
import org.example.repositories.reviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class reviewService implements CommandLineRunner {

    private final reviewRepository reviewRepo;   //Dependency Injection

    private final bookingRepository bookingRepo;

    public reviewService(reviewRepository reviewRepo , bookingRepository bookingRepo) {
        this.reviewRepo = reviewRepo;
        this.bookingRepo = bookingRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("***********************");

        Review r = Review.builder()
                .Content("Driver was nice")
                .rating(4.0)
                .build();

        Booking b = Booking.builder()
                .startTime(new Date())
                .endTime(new Date())
                .totalDistance((long) 21.4)
                .review(r)  // Inject a review object inside booking object that is called class composition
                .build();

        reviewRepo.save(r); //execute the sql to insert an entry in the table
        bookingRepo.save(b); //save the entry in booking table

    }
}

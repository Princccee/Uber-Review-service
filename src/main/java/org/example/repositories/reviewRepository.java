package org.example.repositories;

import org.example.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface reviewRepository extends JpaRepository<Review, Long> {

}

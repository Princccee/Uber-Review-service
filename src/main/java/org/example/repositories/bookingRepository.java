package org.example.repositories;

import org.example.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookingRepository extends JpaRepository<Booking, Long> {

}

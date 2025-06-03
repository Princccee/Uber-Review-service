package org.example.repositories;

import java.util.List;
import org.example.models.Booking;
import org.example.models.Passengers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookingRepository extends JpaRepository<Booking, Long> {

//    List<Passengers> findByName(String name);
}

package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Driver extends baseModel{

    private String name;

    @Column(nullable = false, unique = true)
    private String licenceNumber;

    //Lets have 1:n association as a driver can have many bookings
    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings = new ArrayList<>();

}

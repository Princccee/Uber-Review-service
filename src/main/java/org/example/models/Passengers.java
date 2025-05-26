package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passengers extends baseModel{

    private String name;

    @Column(nullable = false, unique = true)
    private String phNumber;

    //1:n as one passenger can have many bookings:
    @OneToMany(mappedBy = "passenger")
    List<Booking> bookings = new ArrayList<>();

}

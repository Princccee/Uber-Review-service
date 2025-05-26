package org.example.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends baseModel{

    @OneToOne  // one booking will have one review
    private Review review;  // Composition

    @Enumerated(value = EnumType.STRING) // tells spring that its an enum
    private BookingStatus bookingStatus;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;

    private long totalDistance;
}

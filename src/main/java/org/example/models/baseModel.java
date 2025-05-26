package org.example.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass //handles inheritance in Spring data JPA
@Getter
@Setter
public abstract class baseModel {
    @Id  // makes the field as primary key in our DB table
    @GeneratedValue(strategy = GenerationType.TABLE) // generate unique ID for each table
    protected Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // decides the format of date stored
    @CreatedDate // tells the spring to add value when created
    protected Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate // tells the spring to add value when updated
    protected Date updatedAt;
}

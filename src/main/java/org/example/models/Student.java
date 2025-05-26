package org.example.models;

import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.*;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student extends baseModel {
    private String name;
    private String rollNo;
    private String phNumber;
    private Date admissionDate;

    @ManyToMany
    //Build a third join / through table in to handle many to many mapping
    @JoinTable(
            name = "student_course", //third table name
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses = new ArrayList<>();
}

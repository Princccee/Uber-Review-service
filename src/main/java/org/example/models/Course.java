package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course extends baseModel{

    private String courseName;

    @ManyToMany(mappedBy ="courses")
    private List<Student> enrolledStudents;

}

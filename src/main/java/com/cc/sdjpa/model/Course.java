package com.cc.sdjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Course {
    @Id
    private Long id;

    private String name;

    @ManyToMany
    private Set<Student> students;
}

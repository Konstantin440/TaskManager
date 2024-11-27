package org.example.taskmanager.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nameTask;
    private String description;
    private LocalDate deadline;

    @ManyToOne
    @JoinColumn ( name = "user_id")
    private User user;
}

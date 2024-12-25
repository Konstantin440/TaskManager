package org.example.taskmanager.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Data

public class Task {




    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String nameTask;
    private String description;
    private LocalDate deadline;

    @ManyToOne
    @JoinColumn ( name = "user_id")
    private User user;


}

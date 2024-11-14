package com.ignitec.todolist.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_todos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean realization;
    private Integer priority;
}

package com.nadeem.microservices.userservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users") // ✅ Add this line
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}

package com.nadeem.microservices.userservice.repository;

import com.nadeem.microservices.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}

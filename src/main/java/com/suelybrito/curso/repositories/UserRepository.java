package com.suelybrito.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suelybrito.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
package com.example.students.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.students.model.studentModel;

@Repository
public interface studentRepository extends JpaRepository<studentModel, Integer> {
}

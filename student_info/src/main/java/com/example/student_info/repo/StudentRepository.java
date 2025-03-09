package com.example.student_info.repo;


import com.example.student_info.model.studentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<studentModel, Integer> {
}

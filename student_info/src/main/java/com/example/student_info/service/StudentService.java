package com.example.student_info.service;


import com.example.student_info.model.StudentModel;
import com.example.student_info.repo.StudentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

 @Autowired
 private StudentRepository studentRepository;

 public List<StudentModel> getAllStudents() {
     return studentRepository.findAll();
 }

 public Optional<StudentModel> getStudentById(int studentId) {
     return studentRepository.findById(studentId);
 }

 public StudentModel createStudent(@Valid StudentModel student) {
     return studentRepository.save(student);
 }

 public StudentModel updateStudent(int studentId, @Valid StudentModel studentDetails) {
     return studentRepository.findById(studentId).map(student -> {
         student.setRegisterNumber(studentDetails.getRegisterNumber());
         student.setPlaced(studentDetails.isPlaced());
         student.setCourseId(studentDetails.getCourseId());
         student.setDepartmentId(studentDetails.getDepartmentId());
         student.setBatchId(studentDetails.getBatchId());
         student.setMentorId(studentDetails.getMentorId());
         student.setSupervisorId(studentDetails.getSupervisorId());
         student.setSslc(studentDetails.getSslc());
         student.setHsc(studentDetails.getHsc());
         student.setDiploma(studentDetails.getDiploma());
         student.setArrears(studentDetails.getArrears());
         student.setAptitude(studentDetails.isAptitude());
         student.setCoding(studentDetails.isCoding());
         student.setActive(studentDetails.isActive());
         return studentRepository.save(student);
     }).orElseThrow(() -> new RuntimeException("Student not found"));
 }

 public void deleteStudent(int studentId) {
     studentRepository.deleteById(studentId);
 }
}


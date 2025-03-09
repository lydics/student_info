package com.example.student_info.service;


import com.example.student_info.model.studentModel;
import com.example.student_info.repo.studentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentService {

 @Autowired
 private studentRepository studentRepository;

 public List<studentModel> getAllStudents() {
     return studentRepository.findAll();
 }

 public Optional<studentModel> getStudentById(int studentId) {
     return studentRepository.findById(studentId);
 }

 public studentModel createStudent(@Valid studentModel student) {
     return studentRepository.save(student);
 }

 public studentModel updateStudent(int studentId, @Valid studentModel studentDetails) {
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


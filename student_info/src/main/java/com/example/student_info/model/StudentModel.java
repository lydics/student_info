package com.example.student_info.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "students")
public class StudentModel {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int studentId;
 
 @NotBlank
 private String registerNumber;
 
 private boolean isPlaced;
 private int courseId;
 public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getRegisterNumber() {
	return registerNumber;
}

public void setRegisterNumber(String registerNumber) {
	this.registerNumber = registerNumber;
}

public boolean isPlaced() {
	return isPlaced;
}

public void setPlaced(boolean isPlaced) {
	this.isPlaced = isPlaced;
}

public int getCourseId() {
	return courseId;
}

public void setCourseId(int courseId) {
	this.courseId = courseId;
}

public int getDepartmentId() {
	return departmentId;
}

public void setDepartmentId(int departmentId) {
	this.departmentId = departmentId;
}

public int getBatchId() {
	return batchId;
}

public void setBatchId(int batchId) {
	this.batchId = batchId;
}

public int getMentorId() {
	return mentorId;
}

public void setMentorId(int mentorId) {
	this.mentorId = mentorId;
}

public int getSupervisorId() {
	return supervisorId;
}

public void setSupervisorId(int supervisorId) {
	this.supervisorId = supervisorId;
}

public double getSslc() {
	return sslc;
}

public void setSslc(double sslc) {
	this.sslc = sslc;
}

public double getHsc() {
	return hsc;
}

public void setHsc(double hsc) {
	this.hsc = hsc;
}

public double getDiploma() {
	return diploma;
}

public void setDiploma(double diploma) {
	this.diploma = diploma;
}

public int getArrears() {
	return arrears;
}

public void setArrears(int arrears) {
	this.arrears = arrears;
}

public boolean isAptitude() {
	return isAptitude;
}

public void setAptitude(boolean isAptitude) {
	this.isAptitude = isAptitude;
}

public boolean isCoding() {
	return isCoding;
}

public void setCoding(boolean isCoding) {
	this.isCoding = isCoding;
}

public boolean isActive() {
	return isActive;
}

public void setActive(boolean isActive) {
	this.isActive = isActive;
}

public LocalDateTime getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(LocalDateTime createdAt) {
	this.createdAt = createdAt;
}

public LocalDateTime getUpdatedAt() {
	return updatedAt;
}

public void setUpdatedAt(LocalDateTime updatedAt) {
	this.updatedAt = updatedAt;
}

private int departmentId;
 private int batchId;
 private int mentorId;
 private int supervisorId;
 
 @Min(0)
 @Max(100)
 private double sslc;
 
 @Min(0)
 @Max(100)
 private double hsc;
 
 private double diploma;
 private int arrears;
 private boolean isAptitude;
 private boolean isCoding;
 private boolean isActive;
 
 private LocalDateTime createdAt;
 private LocalDateTime updatedAt;

 @PrePersist
 protected void onCreate() {
     createdAt = LocalDateTime.now();
 }

 @PreUpdate
 protected void onUpdate() {
     updatedAt = LocalDateTime.now();
 }

 // Getters and Setters
}

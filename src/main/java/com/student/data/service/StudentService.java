package com.student.data.service;

import com.student.data.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public List<Student> getAllStudents();
    public Optional<Student> getStudentById(Long id);
    public Student createStudent(Student student);
    public Student updateStudent(Long id, Student studentDetails);
    public void deleteStudent(Long id);
}

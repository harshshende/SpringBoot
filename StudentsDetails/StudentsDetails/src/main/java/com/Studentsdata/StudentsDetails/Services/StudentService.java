package com.Studentsdata.StudentsDetails.Services;

import com.Studentsdata.StudentsDetails.Model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getByStudentId(Long id);

    Student updateStudent(Student student, long id);


    void deleteByStudentId(long id);
}

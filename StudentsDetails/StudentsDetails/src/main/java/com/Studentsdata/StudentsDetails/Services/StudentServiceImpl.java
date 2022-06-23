package com.Studentsdata.StudentsDetails.Services;

import com.Studentsdata.StudentsDetails.Repository.StudentRepository;
import com.Studentsdata.StudentsDetails.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getByStudentId(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student, long id) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteByStudentId(long id) {
        studentRepository.deleteById(id);
    }
}

package com.Studentsdata.StudentsDetails.Repository;

import com.Studentsdata.StudentsDetails.Model.Student;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);
}

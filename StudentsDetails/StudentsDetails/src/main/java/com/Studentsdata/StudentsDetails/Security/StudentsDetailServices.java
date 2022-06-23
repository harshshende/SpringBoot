package com.Studentsdata.StudentsDetails.Security;

import com.Studentsdata.StudentsDetails.Model.Student;
import com.Studentsdata.StudentsDetails.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class StudentsDetailServices implements UserDetailsService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Student student = this.studentRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException(username));
        return student;
    }
}

package com.Studentsdata.StudentsDetails.Controller;

import com.Studentsdata.StudentsDetails.Model.Student;
import com.Studentsdata.StudentsDetails.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class StudentController {
    @Autowired

    private StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    // handler method to handle list students and return mode and view
    @GetMapping
    public List<Student> getAllStudents(){return studentService.getAllStudents();}


    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return  new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> getByStudentId(@PathVariable("id") long id) {
        return new ResponseEntity<Student>(studentService.getByStudentId(id), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") long id, @RequestBody Student student){
        return new ResponseEntity<Student>(studentService.updateStudent(student, id),HttpStatus.OK );
    }

    // handler method to handle delete student request

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
        studentService.deleteByStudentId(id);
        return new ResponseEntity<String>("Student Deleted", HttpStatus.OK);
    }
}

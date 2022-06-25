package com.application1.appliction1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app1")
@RestController
public class StudentsController {
    @Autowired
    RestClient restClient;

    @RequestMapping(value = "students/get", method =  RequestMethod.GET)
    @ResponseBody
    public Students save(){
        Students students = new Students();
        students.setFname("Harsahd");
        students.setLname("Shende");
        students.setEmail("shende@gmail");
        return restClient.save(students);
    }
}

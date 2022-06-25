package com.application2.appliction2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/app2")
@RestController
public class StudentsController {
    @RequestMapping(value = "/students/get", method = RequestMethod.POST)
    @ResponseBody
    public Students save(@RequestBody Students students){
        students.setFname("Virat");
        students.setLname("Kohli");
        students.setEmail("virat@gmail");

        return students;
    }

}

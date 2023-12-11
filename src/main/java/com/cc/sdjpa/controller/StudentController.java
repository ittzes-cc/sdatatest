package com.cc.sdjpa.controller;

import com.cc.sdjpa.dto.StudentDTO;
import com.cc.sdjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    private StudentService studentService;


    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public @ResponseBody List<StudentDTO> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public void postStudent(@RequestBody StudentDTO studentDTO){
        studentService.saveStudent(studentDTO);
    }
}

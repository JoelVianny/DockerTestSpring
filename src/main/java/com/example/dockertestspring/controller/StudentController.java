package com.example.dockertestspring.controller;

import com.example.dockertestspring.entity.Student;
import com.example.dockertestspring.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private  final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
       return studentService.getAllStudent();
    }
    @GetMapping("/{id}")
    public Student getOneStudent(@PathVariable long id){
        return studentService.getStudent(id);

    }

    @PostMapping()
    public Student createStudent(@RequestBody Student student){

        return studentService.createStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable long id , @RequestBody Student student){
        return  studentService.updateStudent(id,student);
    }
    @DeleteMapping("/{id}")
    public void  deleteStudent(@PathVariable long id){
        studentService.deleteStudent(id);
    }

}

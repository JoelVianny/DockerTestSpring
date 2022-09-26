package com.example.dockertestspring.controller;

import com.example.dockertestspring.entity.Student;
import com.example.dockertestspring.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return  studentService.getStudents();
    }


    @GetMapping("/{id}")
    public  Student getStudentById(@PathVariable long id){
        return  studentService.getStudent(id);
    }

    @PostMapping()
    public Student saveStudent(@RequestBody Student student){
        return  studentService.saveStudent(student);
    }
    @PutMapping("/{id}")
     public  Student  updateStudent(@PathVariable long id ,  @RequestBody Student student){
        return studentService.updateStudent(id,student);
    }

    @DeleteMapping("/{id}")
    public  String  deleteStudent(@PathVariable long id){
        return studentService.deleteStudent(id);
    }

}

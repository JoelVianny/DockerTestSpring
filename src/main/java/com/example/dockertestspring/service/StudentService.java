package com.example.dockertestspring.service;

import com.example.dockertestspring.entity.Student;
import com.example.dockertestspring.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentService {
     private final StudentRepository studentRepository;

     public List<Student> getStudents(){
         return  studentRepository.findAll();
     }

     public Student getStudent(long id){
         return  studentRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("not found"));
     }

     public Student saveStudent(Student student){
         log.info(student.toString());
          return studentRepository.save(student);
     }

     public Student updateStudent(long id , Student student){
         log.info(student.toString());
         Student foundStudent =  getStudent(id);

         foundStudent.setName(student.getName());
         foundStudent.setSurname(student.getSurname());
         foundStudent.setPatronymic(student.getPatronymic());
         foundStudent.setNumberGroup(student.getNumberGroup());
         foundStudent.setLevel(student.getLevel());
          log.info(foundStudent.toString());
          return  studentRepository.save(foundStudent);

     }

     public String deleteStudent(long id){
          studentRepository.deleteById(id);
          return  " student deleted";
     }
}

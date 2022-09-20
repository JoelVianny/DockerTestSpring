package com.example.dockertestspring.service;

import com.example.dockertestspring.entity.Student;
import com.example.dockertestspring.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

     public List <Student> getAllStudent(){
        return  studentRepository.findAll();
    }
    public Student getStudent( long id){
        return  studentRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("not foound"));
    }

    public Student updateStudent( long idStudent , Student student ){

        studentRepository.findById(idStudent).ifPresent(stud->{
            stud.setName(student.getName());
            stud.setSurname(student.getSurname());
            stud.setPatronymic(student.getPatronymic());
            stud.setGroupStudent(student.getGroupStudent());
            stud.setLevel(student.getLevel());
        });
          return studentRepository.save(student);
    }
     public  Student  createStudent(Student student){
         return studentRepository.save(student);
     }

     public void deleteStudent(long id){
          studentRepository.deleteById(id);
     }

}

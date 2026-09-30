package com.example.crud.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.crud.entity.Student;
import com.example.crud.repository.StudentRepository;

@Service
public class StudentService {
    StudentRepository studRepo;
    public StudentService(StudentRepository studRepo) {
        super();
        this.studRepo = studRepo;
    }
    public void createStudent(Student st) { studRepo.save(st); }
    public Student getStudent(int roll) { return studRepo.findById(roll).orElse(null); }
    public List<Student> getAllStudent() { return studRepo.findAll(); }
    public void updateStudent(Student st) { studRepo.save(st); }
    public void deleteStudent(int roll) { studRepo.deleteById(roll); }
    public Student getStudentByEmail(String email) { return studRepo.findByEmail(email); }
}
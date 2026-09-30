package com.example.crud.controller;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.crud.entity.Student;
import com.example.crud.service.StudentService;

@RestController
public class StudentController {
    StudentService studService;
    public StudentController(StudentService studService) {
        super();
        this.studService = studService;
    }
    @PostMapping("/create")
    public String create(@RequestBody Student st) {
        studService.createStudent(st);
        return "Student is saved";
    }
    @GetMapping("/get/{roll}")
    public Student get(@PathVariable int roll) {
        return studService.getStudent(roll);
    }
    @GetMapping("/getAll")
    public List<Student> getAll() { return studService.getAllStudent(); }

    @PutMapping("/update/{roll}")
    public String update(@PathVariable int roll, @RequestBody Student st) {
        st.setRoll(roll);
        studService.createStudent(st);
        return "Student is updated";
    }
    @DeleteMapping("/delete/{roll}")
    public String delete(@PathVariable int roll) {
        studService.deleteStudent(roll);
        return "Student is deleted";
    }
    @GetMapping("/getmail/{email}")
    public Student getStudentByEmail(@PathVariable String email) {
        return studService.getStudentByEmail(email);
    }
}
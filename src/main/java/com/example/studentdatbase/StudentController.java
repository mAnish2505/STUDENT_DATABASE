package com.example.studentdatbase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(path="v1/basic")
public class StudentController
{
    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public List<Student> getStudent()
    {
       return studentService.getStudent();
    }
    @PostMapping
    public void registerStudent(@RequestBody Student student)
    {
        studentService.addNewStudent(student);
    }
    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId)
    {
        studentService.deleteStudent(studentId);
    }
    @PutMapping(path="{studentId}")
    public void updateStudent(@PathVariable Long studentId,@RequestParam(required = false)String name,@RequestParam(required = false)String email)
    {
       studentService.updateStudent(studentId,name,email);
    }

}

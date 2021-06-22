package com.example.studentdatbase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig
{
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository)
    {
        return args ->
        {
            Student ramesh= new Student(1234L,"Ramesh Kumar",LocalDate.of(1999, Month.JULY,25),"rameshkumar@gmail.com");
            Student vijay= new Student(4321L,"Vijay Kumar",LocalDate.of(1992, Month.JULY,2),"vijaykumar@gmail.com");
            studentRepository.saveAll(List.of(ramesh,vijay));
        };
    }
}

package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student niranjan = new Student(
                    "Niranjan",
                    "niranjan@gmail.com",
                    LocalDate.of(1998, SEPTEMBER, 26)
            );
            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, SEPTEMBER, 17)
            );

            repository.saveAll(List.of(niranjan, alex));
        };
    }
}

package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
            return args -> {
                Student sathya = new Student(
                        "srisathya@gmail.com",
                        "sathya",
                        LocalDate.of(2003, 2, 7)
                );

                repository.saveAll(List.of(sathya));
            };
    }
}

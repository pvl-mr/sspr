package com.example.lab2.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student matiya = new Student(
                    "Matiya",
                    "mari@mail.com",
                    LocalDate.of(2000, Month.JANUARY, 1)
            );
            Student matiya2 = new Student(
                    "Matiya2",
                    "mari2@mail.com",
                    LocalDate.of(2010, Month.JANUARY, 1)
            );

            repository.saveAll(
                    List.of(matiya, matiya2)
            );
        };
    }
}

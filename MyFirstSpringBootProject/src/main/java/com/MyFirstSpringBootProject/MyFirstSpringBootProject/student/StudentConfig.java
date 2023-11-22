package com.MyFirstSpringBootProject.MyFirstSpringBootProject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
   // @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
           Student iyona= new Student(
                   "Iyona",
                   "iyona@gmail.com",
                   LocalDate.of(1990, Month.MAY,
                           11
                   )
           );
           Student kasun= new Student(
                   "kasun",
                   "kasun@gmail.com",
                   LocalDate.of(1990,
                           Month.APRIL,
                           03
                   )
           );
           Student priya= new Student(
                   "Priya",
                   "priya@gmail.com",
                   LocalDate.of(1972, Month.OCTOBER,16
                   )
           );

            studentRepository.saveAll(List.of(iyona,kasun,priya));
        };

    }
}

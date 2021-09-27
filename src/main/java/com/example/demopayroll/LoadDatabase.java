package com.example.demopayroll;

import com.example.demopayroll.domain.Employee;
import com.example.demopayroll.domain.Order;
import com.example.demopayroll.repository.EmployeeRepository;
import com.example.demopayroll.repository.OrderRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {

    return args -> {

      log.info("Preloading " + employeeRepository.save(new Employee("Bilbo", "Baggins", "burglar")));
      log.info("Preloading " + employeeRepository.save(new Employee("Frodo", "Baggins", "thief")));


      log.info("Preloading " + orderRepository.save(new Order("Macbook", Status.COMPLETED)));
      log.info("Preloading " + orderRepository.save(new Order("iPhone", Status.IN_PROGRESS)));

    };
  }

}

package payroll;

import lombok.extern.slf4j.Slf4j;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository, OrderRepository orderRepository) {
        return args -> {
            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });

            repository.save(new Employee("Bilbo Baggins", "burglar"));
            repository.save(new Employee("Frodo Baggings", "thief"));

            repository.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });
        };
    }
}

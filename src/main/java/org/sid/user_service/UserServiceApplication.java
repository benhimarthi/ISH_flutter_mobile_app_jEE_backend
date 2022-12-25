package org.sid.user_service;

import org.sid.user_service.entities.User;
import org.sid.user_service.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class UserServiceApplication {

    @Autowired
    UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(){
        var u1 = User.builder().id(1L).fullName("winny").mailAdress("b.wynni@mundiapolis.ma").password("12345").build();
        var u2 = User.builder().id(2L).fullName("nouha").mailAdress("n.nouha@mundiapolis.ma").password("12345").build();
        System.out.println(u1.toString());
        return args -> {
            userRepository.saveAll(
            List.of(

            )
            );
        };
    }
}

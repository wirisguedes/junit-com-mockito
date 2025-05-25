package com.example.api.config;

import com.example.api.domain.User;
import com.example.api.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Bean
    public CommandLineRunner startDB(UserRepository repository) {
        return args -> {
            User u1 = new User(null, "iris", "iris@gmail.com", "123");
            User u2 = new User(null, "albert", "albert@gmail.com", "123");

            repository.saveAll(List.of(u1, u2));
        };
    }
}

package com.bank.yanki.infraestructure.spring.config;

import com.bank.yanki.application.model.YankiRepository;
import com.bank.yanki.infraestructure.repository.YankiCrudRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public YankiRepository repository() {
        return new YankiCrudRepository();
    }

}

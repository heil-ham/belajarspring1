package com.belajar.belajarspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CatConfiguration.class, DogConfiguration.class})
public class MainConfiguration {
}

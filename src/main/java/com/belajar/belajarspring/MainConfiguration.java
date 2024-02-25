package com.belajar.belajarspring;

import com.belajar.belajarspring.configuration.CatConfiguration;
import com.belajar.belajarspring.configuration.DogConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CatConfiguration.class, DogConfiguration.class})
public class MainConfiguration {
}

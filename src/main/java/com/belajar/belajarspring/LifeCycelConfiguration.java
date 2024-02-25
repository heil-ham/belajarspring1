package com.belajar.belajarspring;

import com.belajar.belajarspring.data.Connection;
import com.belajar.belajarspring.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycelConfiguration {
    @Bean
    public Connection  connection() {
        return new Connection();
    }

//    @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server() {
        return new Server();
    }
}

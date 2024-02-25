package com.belajar.belajarspring;

import com.belajar.belajarspring.repository.ProductRepository;
import com.belajar.belajarspring.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testComponent() {
        ProductService prod = applicationContext.getBean(ProductService.class);
        ProductService prod2 = applicationContext.getBean("productService",ProductService.class);

        Assertions.assertSame(prod2,prod);
    }

    @Test
    void testConstructorDependencyInjection() {
        ProductService productService = applicationContext.getBean(ProductService.class);
//        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
        productService.getProductRepository();
    }
}

package net.javaguides.springdatajpacourseNQ;
import net.javaguides.springdatajpacourseNQ.*;
import net.javaguides.springdatajpacourseNQ.entity.Product;
import net.javaguides.springdatajpacourseNQ.repository.ProductRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.*;

@SpringBootTest
public class NamedQueriesTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void namedJPQLQuery(){

        Product product = productRepository.findByPrice(new BigDecimal(100));

        System.out.println(product.getName());
        System.out.println(product.getDescription());
    }
}
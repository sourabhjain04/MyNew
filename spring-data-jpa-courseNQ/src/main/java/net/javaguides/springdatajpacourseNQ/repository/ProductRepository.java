package net.javaguides.springdatajpacourseNQ.repository;
import net.javaguides.springdatajpacourseNQ.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;


public interface ProductRepository extends JpaRepository<Product, Long> 
{
    // Define Named JPQL query
    Product findByPrice(@Param("price") BigDecimal price);
}
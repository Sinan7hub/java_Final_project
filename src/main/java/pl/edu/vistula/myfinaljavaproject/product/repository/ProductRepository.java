package pl.edu.vistula.myfinaljavaproject.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.vistula.myfinaljavaproject.product.domain.Product;

import java.util.*;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}


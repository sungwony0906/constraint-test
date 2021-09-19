package kr.co.test.contstraint.repository;

import kr.co.test.contstraint.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
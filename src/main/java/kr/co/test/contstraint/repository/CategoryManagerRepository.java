package kr.co.test.contstraint.repository;

import kr.co.test.contstraint.entity.CategoryManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryManagerRepository extends JpaRepository<CategoryManager, Long> {
}
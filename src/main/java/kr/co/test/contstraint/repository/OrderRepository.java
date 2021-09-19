package kr.co.test.contstraint.repository;

import kr.co.test.contstraint.entity.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderInfo, Long> {
}
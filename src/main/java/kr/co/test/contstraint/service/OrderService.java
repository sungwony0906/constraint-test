package kr.co.test.contstraint.service;

import kr.co.test.contstraint.dto.OrderCreateInfo;
import kr.co.test.contstraint.dto.OrderInfoDto;
import kr.co.test.contstraint.entity.MemberInfo;
import kr.co.test.contstraint.entity.OrderInfo;
import kr.co.test.contstraint.entity.Product;
import kr.co.test.contstraint.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class OrderService {

	private final MemberRepository memberRepository;
	private final OrderRepository orderRepository;
	private final ProductRepository productRepository;


	public List<OrderInfoDto> searchAllOrderInfo() {
		return OrderInfoDto.fromList(orderRepository.findAll());
	}

	@Transactional
	public void saveOrder(OrderCreateInfo orderCreateInfo) {
		MemberInfo member = memberRepository.findById(orderCreateInfo.getOrdererId()).orElseThrow(() -> new RuntimeException("NOT EXIST MEMBER"));
		Product product = productRepository.findById(orderCreateInfo.getProductId()).orElseThrow(() -> new RuntimeException("NOT EXIST PRODUCT"));
		orderRepository.save(OrderInfo.from(orderCreateInfo, member, product));
	}
}

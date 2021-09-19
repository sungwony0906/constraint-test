package kr.co.test.contstraint.service;

import kr.co.test.contstraint.repository.MemberRepository;
import kr.co.test.contstraint.repository.OrderRepository;
import kr.co.test.contstraint.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class OrderInfoServiceTest extends BasicDbTest{

	@Autowired
	OrderService orderService;

	@Autowired
	MemberRepository memberRepository;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ProductRepository productRepository;

	// TODO:  searchAllOrderInfo의 기능을 개발했습니다. 해당 기능을 테스트 해주세요.
	/*
	 	searchAllOrderInfo는 모든 데이터를 조회하는 메서드 입니다.
	 	@SpringBootTest를 이용해 통합테스트가 필요 무조건 해야합니다.


	 */
	@Test
	void test_1() {
		//orderService.searchAllOrderInfo();
	}

	// TODO:  saveOrder(...) 기능을 개발했습니다. 해당 기능을 테스트 해주세요.
	/*
	 	saveOrder(OrderCreateInfo orderCreateInfo) 주문을 저장하는 메서드입니다.
	 	@SpringBootTest를 이용해 통합테스트가 필요 무조건 해야합니다.

	 */
	@Test
	void test_2() {
		//orderService.saveOrder(...);
	}


}
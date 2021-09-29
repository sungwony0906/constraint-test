package kr.co.test.contstraint.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import kr.co.test.contstraint.dto.OrderCreateInfo;
import kr.co.test.contstraint.dto.OrderInfoDto;
import kr.co.test.contstraint.entity.CategoryManager;
import kr.co.test.contstraint.entity.MemberInfo;
import kr.co.test.contstraint.entity.OrderInfo;
import kr.co.test.contstraint.entity.Product;
import kr.co.test.contstraint.entity.ProductCategory;
import kr.co.test.contstraint.repository.CategoryManagerRepository;
import kr.co.test.contstraint.repository.MemberRepository;
import kr.co.test.contstraint.repository.OrderRepository;
import kr.co.test.contstraint.repository.ProductCategoryRepository;
import kr.co.test.contstraint.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OrderInfoServiceTest extends BasicDbTest{

	@Autowired
	OrderService orderService;

	@Autowired
	MemberRepository memberRepository;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	CategoryManagerRepository categoryManagerRepository;

	@Autowired
	ProductCategoryRepository productCategoryRepository;

	@BeforeEach
	void setUp() {
		CategoryManager categoryManager = CategoryManager.builder()
												  .categoryManagerId(1L)
												  .name("name")
												  .phoneNumber("010111")
												  .build();

		ProductCategory productCategory = ProductCategory.builder()
												  .productCategoryId(1L)
												  .name("name")
												  .categoryManager(categoryManager)
												  .build();

		Product product = Product.builder()
								  .productId(1L)
								  .name("product")
								  .productCategory(productCategory)
								  .price(10D)
								  .build();

		categoryManagerRepository.save(categoryManager);
		productCategoryRepository.save(productCategory);
		productRepository.save(product);

		MemberInfo memberInfo = MemberInfo.builder()
										.memberId(1L)
										.name("orderer")
										.address("seoul")
										.build();

		memberRepository.save(memberInfo);
	}


	// TODO:  searchAllOrderInfo의 기능을 개발했습니다. 해당 기능을 테스트 해주세요.
	/*
	 	searchAllOrderInfo는 모든 데이터를 조회하는 메서드 입니다.
	 	@SpringBootTest를 이용해 통합테스트가 필요 무조건 해야합니다.


	 */
	@Test
	void test_1() {
		//orderService.searchAllOrderInfo();
		주문_저장(new OrderCreateInfo(1L, 1L, 1, 1D));

		List<OrderInfoDto> orderInfoDtos = orderService.searchAllOrderInfo();
		assertThat(orderInfoDtos.size()).isEqualTo(1);
		assertThat(orderInfoDtos.get(0).getOrdererName()).isEqualTo("orderer");
		assertThat(orderInfoDtos.get(0).getProductName()).isEqualTo("product");
	}

	// TODO:  saveOrder(...) 기능을 개발했습니다. 해당 기능을 테스트 해주세요.
	/*
	 	saveOrder(OrderCreateInfo orderCreateInfo) 주문을 저장하는 메서드입니다.
	 	@SpringBootTest를 이용해 통합테스트가 필요 무조건 해야합니다.

	 */
	@Test
	void test_2() {
		주문_저장(new OrderCreateInfo(1L, 1L, 1, 1D));
		//orderService.saveOrder(...);
		List<OrderInfo> orders = orderRepository.findAll();
		assertThat(orders.size()).isEqualTo(1);

		assertThat(orders.get(0).getOrderer().getMemberId()).isEqualTo(1L);
		assertThat(orders.get(0).getProduct().getProductId()).isEqualTo(1L);
	}

	private void 주문_저장(OrderCreateInfo orderCreateInfo) {
		orderService.saveOrder(orderCreateInfo);
	}


}
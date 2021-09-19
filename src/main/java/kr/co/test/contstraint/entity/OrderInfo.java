package kr.co.test.contstraint.entity;

import kr.co.test.contstraint.dto.OrderCreateInfo;
import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Entity
@Table
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderInfoId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	private Member orderer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private Product product;

	@Column
	private Integer amount;

	@Column
	private Double totalOrderAmount;

	public OrderInfo() {

	}

	public static OrderInfo from(OrderCreateInfo orderCreateInfo, Member member, Product product) {
		return OrderInfo.builder()
						.orderer(member)
						.product(product)
						.amount(orderCreateInfo.getAmount())
						.totalOrderAmount(orderCreateInfo.getTotolOrderAmount())
						.build();
	}
}

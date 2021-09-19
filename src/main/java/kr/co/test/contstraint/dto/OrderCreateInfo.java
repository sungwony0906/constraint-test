package kr.co.test.contstraint.dto;

import lombok.Getter;

@Getter
public class OrderCreateInfo {
	private Long ordererId;

	private Long productId;

	private Integer amount;

	private Double totolOrderAmount;
}

package kr.co.test.contstraint.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class OrderCreateInfo {
	private Long ordererId;

	private Long productId;

	private Integer amount;

	private Double totolOrderAmount;
}

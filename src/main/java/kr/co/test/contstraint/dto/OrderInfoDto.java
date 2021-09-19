package kr.co.test.contstraint.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderInfoDto {

	private Long orderId;
	private String ordererName;
	private Double productPrice;
	private Integer productAmount;
	private Double totalOrderAmount;
	private String productName;
	private String productCategoryName;
	private String productCategoryManagerName;
	private String productCategoryManagerPhoneNumber;

	public static List<OrderInfoDto> fromList(List<kr.co.test.contstraint.entity.OrderInfo> orderInfoList) {
		return orderInfoList.stream()
							.map(OrderInfoDto::from)
							.collect(toList());
	}

	public static OrderInfoDto from(kr.co.test.contstraint.entity.OrderInfo orderInfo) {
		return OrderInfoDto.builder()
						   .orderId(orderInfo.getOrderInfoId())
						   .ordererName(orderInfo.getOrderer().getName())
						   .productPrice(orderInfo.getProduct().getPrice())
						   .productAmount(orderInfo.getAmount())
						   .totalOrderAmount(orderInfo.getTotalOrderAmount())
						   .productName(orderInfo.getProduct().getName())
						   .productCategoryName(orderInfo.getProduct().getProductCategory().getName())
						   .productCategoryManagerName(orderInfo.getProduct().getProductCategory().getCategoryManager().getName())
						   .productCategoryManagerPhoneNumber(orderInfo.getProduct().getProductCategory().getCategoryManager().getPhoneNumber())
						   .build();
	}
}


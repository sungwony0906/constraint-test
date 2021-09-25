package kr.co.test.contstraint.entity;

import jdk.jfr.Category;
import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@Table
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Product {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;

	@Column
	private String name;

	@Column
	private Double price;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_category_id")
	private ProductCategory productCategory;

	public Product() {

	}
}

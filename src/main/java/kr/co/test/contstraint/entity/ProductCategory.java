package kr.co.test.contstraint.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Table
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductCategory {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productCategoryId;

	@Column
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_manager_id")
	private CategoryManager categoryManager;

	public ProductCategory() {

	}
}
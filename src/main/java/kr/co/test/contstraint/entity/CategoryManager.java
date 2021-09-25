package kr.co.test.contstraint.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CategoryManager {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryManagerId;

	@Column
	private String name;

	@Column
	private String phoneNumber;

	public CategoryManager() {

	}
}
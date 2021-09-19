package kr.co.test.contstraint.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CategoryManager {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryManagerId;

	@Column
	private String name;

	@Column
	private String phoneNumber;

	public CategoryManager() {

	}
}
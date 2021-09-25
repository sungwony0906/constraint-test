package kr.co.test.contstraint.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@Table
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberInfo {

	@Id
	@Column(name = "member_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long memberId;

	@Column
	private String name;

	@Column
	private String address;

	public MemberInfo() {

	}
}

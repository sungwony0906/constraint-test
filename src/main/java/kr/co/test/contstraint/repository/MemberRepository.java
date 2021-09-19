package kr.co.test.contstraint.repository;

import kr.co.test.contstraint.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
package hello.jin.repository;

import hello.jin.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// id type,  인터페이스는 다중상속
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long> ,MemberRepository {

    @Override
    Optional<Member> findByName(String name);
}

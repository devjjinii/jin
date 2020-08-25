package hello.jin.repository;

import hello.jin.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member Save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findeByName(String name);
    List<Member> findAll();
}

//package hello.jin;
//
//import hello.jin.repository.MemberRepository;
//import hello.jin.repository.MemoryMemberRepository;
//import hello.jin.service.MemberService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SpringConfig {
//
//    @Bean
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }
//
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
//}

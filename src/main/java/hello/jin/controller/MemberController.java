package hello.jin.controller;

import hello.jin.domain.Member;
import hello.jin.repository.MemberRepository;
import hello.jin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

//    필드주입(비추)  생성자주입(권장)
//    @Autowired private MemberService memberService;

    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
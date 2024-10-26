package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.entity.Member;
import com.example.firstproject.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;
    public String newMemberForm(){
        return "members/new";
    }
    @GetMapping("/signup")
    public String signUpPage(){
        return "members/new";
    }
    @PostMapping("/join")
    public String join(MemberForm form){

        Member member = form.toEntity();
        System.out.println(form.toString());

        Member saved = memberRepository.save(member);
        System.out.println(saved.toString());

        return "";
    }
    public String createMembers(){
        return "";
    }
}

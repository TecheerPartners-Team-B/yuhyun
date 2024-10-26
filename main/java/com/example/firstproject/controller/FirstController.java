package com.example.firstproject.controller;

// 컨트롤러 선언과 동시에 자동으로 임포트
import org.springframework.stereotype.Controller;
// URL 연결 요청(@GetMapping())과 동시에 자동으로 임포트
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;  //Model 클래스 패키지 자동 임포트

@Controller // 1. 이 파일이 컨트롤러임을 선언
public class FirstController {
    @GetMapping("/hi") // 2. 클라이언트로부터 "/hi" 라는 요청을 받아 접수

    public String nicetoMeetYou(Model model){ // 3. "/hi" 라는 요청을 받음과 동시에 nicetoMeetYou() 메서드 수행, // 4. 모델 객체 가져오기
        model.addAttribute("username", "hongpark"); // 5. 모델 변수 등록
        return "greetings"; // 6. 메서드 수행 결과로 greetings.mustache 파일을 변환, 서버가 templates 디렉터리에 있는 해당 뷰 템플릿 페이지를 찾아 웹 페이지로 전송
    }
    @GetMapping("/bye")

    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "홍길동");
        return "goodbye";
    }
}


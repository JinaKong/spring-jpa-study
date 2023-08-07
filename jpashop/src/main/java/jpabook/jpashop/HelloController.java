package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller // 컨트롤러에는 이 애노테이션을 달아주어야 한다.
public class HelloController {

    @GetMapping("hello")   // '/hello'일 때 아래 메소드를 호출
    public String hello(Model model){    // controller에서는 Model에 데이터를 담아 view로 보낸다.
        model.addAttribute( "data", "hello!!");

        return "hello";	// 문자열 return
    }
}

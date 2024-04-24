package egovframework.com.vol.web.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/web/index.do")
    public String main() {
        return "vol/web/main/index";
    }

}

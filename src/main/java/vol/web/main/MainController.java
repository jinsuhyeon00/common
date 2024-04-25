package vol.web.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.util.EgovUserDetailsHelper;

@Controller
public class MainController {
    
    @GetMapping("/web/index.do")
    public String main(Model model) {
        //로그인정보
        LoginVO loginVO = (LoginVO) EgovUserDetailsHelper.getAuthenticatedUser();
        model.addAttribute("loginVO", loginVO);
        return "vol/web/main/index";
    }

}

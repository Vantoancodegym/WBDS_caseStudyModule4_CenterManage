package casestudy_module4_centermanage.alcohol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin("*")
@Controller
public class UserController {
    @GetMapping()
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}

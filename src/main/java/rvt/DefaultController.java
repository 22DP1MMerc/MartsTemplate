package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }

    @GetMapping(value = "/about")
    ModelAndView about(){
    ModelAndView modelAndView = new ModelAndView();}
    String aboutMeAction(Model model){
    String name = "Marts";
    String surname = "Mercs";
    int age = 0;
    String group = "DP 2-1"; 
    model.addAttribute(age);

    return "about";
    }
}

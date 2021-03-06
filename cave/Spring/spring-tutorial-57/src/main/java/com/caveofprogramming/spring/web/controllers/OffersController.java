package com.caveofprogramming.spring.web.controllers;

import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OffersController {

//    @RequestMapping("/")
//    public ModelAndView showHome(HttpSession session) {
//        ModelAndView mv = new ModelAndView("home");
//        Map<String, Object> model = mv.getModel();
//        model.put("name", "River"); /* Request scope only, not session */
//        return mv;
//    }
    @RequestMapping("/")
    public String showHome(Model model) {
        model.addAttribute("name", "<b>Tiffany</b>");
        return "home";
    }
    
}

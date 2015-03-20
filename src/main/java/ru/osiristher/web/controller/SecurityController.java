package ru.osiristher.web.controller;

import javafx.beans.property.SimpleListProperty;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.osiristher.web.domain.Person;
import ru.osiristher.web.security.LifeRayToken;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by DesiresDesigner on 3/5/15.
 */

@Controller
public class SecurityController {


    private static final String PROJECT_URL = "http://tvbs.tune-it.ru/web/guest/login?p_p_id=58&p_p_lifecycle=0&_58_redirect=http://127.0.0.1:9000/checking";


    /*@RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(RedirectAttributes redir) {
        /*SecurityContextHolder.
                getContext().
                setAuthentication(new LifeRayToken(new SimpleListProperty<GrantedAuthority>())); // todo: define provider*/
       /* ModelAndView modelAndView = new ModelAndView("redirect:" + PROJECT_URL);
        redir.addAttribute("redirect", "localhost:9000/lol");
        //modelAndView.addObject("redirect", "localhost:9000/lol");
        return modelAndView;
        //return new ModelAndView("redirect:" + PROJECT_URL);
    }*/

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(RedirectAttributes redirectAttributes) {
        //redirectAttributes.addAttribute("redirect", "127.0.0.1:9000/checking");
        //redirectAttributes.addFlashAttribute("fa", faValue);
        return "redirect:" + PROJECT_URL;
    }
    /*public String home(Model model) {
        model.addAttribute("message", "Hello, Spring!");
        model.addAttribute("person", new Person());
        return "login";
    }*/

    @RequestMapping(value = "/checking", method = {RequestMethod.GET, RequestMethod.POST})
    public String check(Model model, HttpServletRequest request) {

        Cookie[] cookies = request.getCookies();
        String message = "";
        for (Cookie cookie : cookies) {
            message += '[' + cookie.getName() + "] = " + cookie.getValue() + '\n';
        }

        //model.addAttribute("message", "Hello, Spring!");
        model.addAttribute("message", message);
        model.addAttribute("person", new Person());
        return "login";
    }


}

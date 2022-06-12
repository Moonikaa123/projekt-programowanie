package com.example.projekt;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {


    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("formularz", new Formularz());
        return "index.html";
    }


    @PostMapping("/processForm")
    public String processForm(@ModelAttribute("formularz") Formularz formularz) {
        int iloscPunktow = 0;
        if(formularz.getPaliwo().equals("Wodor i hel")){
            iloscPunktow++;
        }
        if(formularz.getEtap().equals("90%")){
            iloscPunktow++;
        }
        if(formularz.getGwiazda().equals("Slonce")){
            iloscPunktow++;
        }
        if(formularz.getDlugosc().equals("Masy")){
            iloscPunktow++;
        }
        return "helloworld.html";
    }



}

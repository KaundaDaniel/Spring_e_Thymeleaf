package ao.com.treinaweb.conhencendo_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ao.com.treinaweb.conhencendo_spring.dto.DiaristaForm;

@Controller
@RequestMapping("/")
public class HomeControllers {
    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @GetMapping("/mostraNome")
    public String home2(ModelMap modelMap) {
        modelMap.addAttribute("nome", "Kaunda");
        return "home";

    }
    @GetMapping("/mostraNom")
    public ModelAndView mostraNaTela(){
        var modelMostra= new ModelAndView("home");
        modelMostra.addObject("mostra", "Domingas Maneco");
        return modelMostra;
    }

    @GetMapping("/form")
    public ModelAndView getForm(){
        var mostraForm= new ModelAndView("form");
        mostraForm.addObject("form", new DiaristaForm());
        return mostraForm;
    }

    @PostMapping("/form")
    public String captaDados( DiaristaForm form){
        System.out.println(form);
        return "redirect:/form";
    }
}
                                   
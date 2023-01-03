package ao.com.treinaweb.conhencendo_spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;        
import org.springframework.web.servlet.ModelAndView;

//import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import ao.com.treinaweb.conhencendo_spring.repositors.DiaristaRepositors;

@Controller
@RequestMapping("/diaristas")
public class DiaristaControlls {
    @Autowired
    private DiaristaRepositors diaristaRepositors;

    @GetMapping
    public ModelAndView listarTodosAndView(){
      
        var modelAndView= new ModelAndView("mostrar_diaristas");

        modelAndView.addObject("diaristas", diaristaRepositors.findAll());
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView mostrarDetalhes(@PathVariable Long id) {
        var modelAndView= new ModelAndView("detalhes");
        modelAndView.addObject("diaristas", diaristaRepositors.getReferenceById(id));
        return modelAndView;
    }

}

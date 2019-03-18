package pl.oskarpolak.calorie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.oskarpolak.calorie.models.MacroForm;

import javax.naming.Binding;
import javax.validation.Valid;

@Controller
public class MacroelementController {


    @GetMapping("/macro/add")
    public String addMacro(Model model){
        model.addAttribute("macroForm", new MacroForm());
        return "add_macro";
    }

    @PostMapping("/macro/add")
    public String addMacro(@ModelAttribute @Valid MacroForm macroForm,
                           BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            //na razie nie obslugujemy walidacji //todo
        }

        //todo tutaj dodamy do bazy nasze makro :)
        return "add_macro";
    }

}

package pl.oskarpolak.calorie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.oskarpolak.calorie.models.MacroForm;
import pl.oskarpolak.calorie.models.MacroEntity;
import pl.oskarpolak.calorie.models.MacroRepository;

import javax.validation.Valid;

@Controller
public class MacroelementController {

    @Autowired
    MacroRepository macroRepository;

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

        MacroEntity macroEntity = new MacroEntity();
        macroEntity.setCreationTime(macroForm.getEatDate());
        macroEntity.setWeight(macroForm.getWeight());
        macroEntity.setType(MacroEntity.MacroType.valueOf(macroForm.getMacroType()));

        macroRepository.save(macroEntity);

        //todo tutaj dodamy do bazy nasze makro :)
        return "add_macro";
    }

}

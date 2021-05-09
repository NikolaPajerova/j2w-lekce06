package cz.czechitas.java2webapps.lekce6.controller.cokolada;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Random;

/**
 *
 */
@Controller
@RequestMapping("/cokolada")
public class CokoladaController {
  private final Random random = new Random();


  @GetMapping("")
  public ModelAndView index() {
    ModelAndView modelAndView = new ModelAndView("/cokolada/formular");
    modelAndView.addObject("CokoForm", new CokoladaForm());
    return modelAndView;
  }

  @PostMapping("")
  public Object CokoForm(@ModelAttribute("CokoForm") @Valid CokoladaForm CokoForm, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "/cokolada/formular";  //pokud bude tato chyba, pošle do formuláře a další řádky neprobehnou
    }
    return new ModelAndView("/alkohol/objednano")
            .addObject("kod", Math.abs(random.nextInt()))
            .addObject("email", CokoForm.getEmail());
    }
  }


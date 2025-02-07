package cz.czechitas.java2webapps.lekce6.controller.alkohol;

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
 */
@Controller
@RequestMapping("/alkohol")
public class AlkoholController {
  private final Random random = new Random();

  @GetMapping("")
  public ModelAndView index() {  //jen zobrazuje formulář
    ModelAndView modelAndView = new ModelAndView("/alkohol/formular");
    modelAndView.addObject("form", new AlkoholForm());
    return modelAndView;
  }

  @PostMapping("")
  public Object form(@ModelAttribute("form") @Valid AlkoholForm form, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "/alkohol/formular";  //pokud bude tato chyba, pošle do formuláře a další řádky neprobehnou
    }

    if (form.getVek() < 18) {
      return "/alkohol/nizky-vek";
/*
      bindingResult.rejectValue("vek", "", "To by nešlo. Nejsi náhodou starší?");  //vložení vlastní hlášky erroru
      return "/alkohol/formular";
*/
    }

    return new ModelAndView("/alkohol/objednano")
            .addObject("kod", Math.abs(random.nextInt()))
            .addObject("email", form.getEmail());
  }
}

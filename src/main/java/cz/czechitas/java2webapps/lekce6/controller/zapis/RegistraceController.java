package cz.czechitas.java2webapps.lekce6.controller.zapis;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;
import java.time.LocalDate;
import java.time.Period;


/**
 */
@Controller
@RequestMapping("/zapis")
public class RegistraceController {
  @GetMapping("")
  public ModelAndView index() {
    ModelAndView modelAndView = new ModelAndView("/zapis/formular");
    modelAndView.addObject("form", new RegistraceForm());
    return modelAndView;
  }

  @PostMapping("")
  public Object form(@Valid @ModelAttribute("form") RegistraceForm form, BindingResult bindingResult) {




    Period period = (form.getDatum_narozeni()).until(LocalDate.now());
    int roky = period.getYears();
    if (roky >= 15 || roky <= 9 ) {
      return "/zapis/nizky-vek";
    }


    if (bindingResult.hasErrors()) {
      return "/zapis/formular";
    }

    return new ModelAndView("/zapis/zaznam")
            .addObject("jmeno", form.getJmeno())
            .addObject("prijmeni", form.getPrijmeni())
            .addObject("datum_narozeni", form.getDatum_narozeni())
            .addObject("turnus", form.getTurnus())
            .addObject("email", form.getEmail());
  }
}

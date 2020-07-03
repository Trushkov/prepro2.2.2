package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "locale", required = false) String locale, ModelMap model) {
        if ("ru".equals(locale)) {
            model.addAttribute("title", "МАШИНЫ");
        } else {
            model.addAttribute("title", "CARS");
        }
        model.addAttribute("cars", CarsService.getCars());
        return "cars";
    }

}

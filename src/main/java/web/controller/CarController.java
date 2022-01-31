package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarService;
import web.services.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String printCars(ModelMap model,
                            @RequestParam(value = "count", required = false) Integer count){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("M5", 555, "BMW"));
        cars.add(new Car("RS6", 666, "AUDI"));
        cars.add(new Car("911", 456, "PORSCHE"));
        cars.add(new Car("2107", 78, "LADA"));
        cars.add(new Car("SUPRA", 1200, "TOYOTA"));
        CarService carService = new CarServiceImpl();

        model.addAttribute("cars", carService.getSomeCars(cars, count));

        return "cars";
    }

}

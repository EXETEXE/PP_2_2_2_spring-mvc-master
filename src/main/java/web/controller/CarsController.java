package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private CarDAO carDAO = new CarDAOImpl();

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "amount", required = false) Integer amount, Model model) {

        List<Car> cars = carDAO.getCarList();

        if (amount != null && amount > 0 && amount < 5) {
            cars = cars.stream().limit(amount).toList();
        }

        model.addAttribute("cars", cars);

        return "cars";
    }
}

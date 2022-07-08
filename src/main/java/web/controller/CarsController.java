package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private CarDAO carDAO;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "amount", required = false) Integer amount, Model model) {

        List<Car> cars = carDAO.getCarList(amount);

        model.addAttribute("cars", cars);

        return "cars";
    }
}

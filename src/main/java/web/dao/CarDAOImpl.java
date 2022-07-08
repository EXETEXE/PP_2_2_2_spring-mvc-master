package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    private static List<Car> cars = List.of(
            new Car("BMW", "E12", 1981),
            new Car("LADA", "Kalina", 2004),
            new Car("Chevrolet", "Camaro", 1966),
            new Car("Nissan", "Skyline", 1957),
            new Car("Toyota", "Supra", 1978));

    @Override
    public List<Car> getCarList(Integer amount) {

        if (amount != null && amount > 0 && amount < 5) {

            return cars.stream().limit(amount).toList();
        } else {

            return cars;
        }
    }
}

package web.dao;

import web.model.Car;

import java.util.List;

public class CarDAOImpl implements CarDAO {

    private static List<Car> cars = List.of(
            new Car("BMW", "E12", 1981),
            new Car("LADA", "Kalina", 2004),
            new Car("Chevrolet", "Camaro", 1966),
            new Car("Nissan", "Skyline", 1957),
            new Car("Toyota", "Supra", 1978));

    @Override
    public List<Car> getCarList() {
        return cars;
    }
}

package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("BMW", 3));
        cars.add(new Car("Audi", 6));
        cars.add(new Car("Mercedes", 8));
        cars.add(new Car("Toyota", 5));
        cars.add(new Car("Honda", 7));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count <= 0) {
            return new ArrayList<>();
        }

        if (count >= cars.size()) {
            return cars;
        }

        return cars.subList(0, count);
    }
}
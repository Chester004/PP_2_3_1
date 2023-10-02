package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> cars = new ArrayList<>();

    public CarServiceImp() {
        cars.add(new Car("make1", "model1", 1));
        cars.add(new Car("make2", "model2", 2));
        cars.add(new Car("make3", "model3", 3));
        cars.add(new Car("make4", "model4", 4));
        cars.add(new Car("make5", "model5", 5));
    }
    @Override
    public List<Car> carsCount(int number) {
        return cars.stream().limit(number).collect(Collectors.toList());
    }
}

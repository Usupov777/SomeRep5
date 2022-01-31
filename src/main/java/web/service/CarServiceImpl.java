package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getSomeCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("M5", 555, "BMW"));
        cars.add(new Car("RS6", 666, "AUDI"));
        cars.add(new Car("911", 456, "PORSCHE"));
        cars.add(new Car("2107", 78, "LADA"));
        cars.add(new Car("SUPRA", 1200, "TOYOTA"));
        if(count == null || count > cars.size()){
            return cars;
        }
        return cars.subList(0, count);
    }
}

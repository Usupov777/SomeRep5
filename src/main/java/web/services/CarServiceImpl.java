package web.services;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getSomeCars(List<Car> cars, Integer count) {
        if(count == null || count > cars.size()){
            return cars;
        }
        return cars.subList(0, count);
    }
}

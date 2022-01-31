package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.DAO.CarDAOImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    CarDAO carDAO;

    @Override
    public List<Car> getSomeCars(Integer count) {
        return carDAO.getSomeCars(count);
    }
}

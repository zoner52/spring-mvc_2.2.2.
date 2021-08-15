package web.service;


import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List <Car> carList;
    {
        carList = new ArrayList<Car>();
        carList.add(new Car("Tesla", "blue", 1));
        carList.add(new Car("Opel", "red", 4));
        carList.add(new Car("Lada", "rzhavchina", 100));
        carList.add(new Car("Kia", "white", 3));
        carList.add(new Car("BMW", "black", 1));
        carList.add(new Car("Scoda", "green", 2));
        carList.add(new Car("Lexus", "gray", 6));
    }


    @Override
    public List<Car> carlist(Integer count) {
        if ((count > 0) && (count < 5)) {
            return carList.stream().limit(count).collect(Collectors.toList());
        } else {
            return carList;
        }
    }
}

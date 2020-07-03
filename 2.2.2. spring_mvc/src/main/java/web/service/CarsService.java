package web.service;

import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class CarsService {

    public static List<Car> getCars(){
        List<Car> cars = Arrays.asList(new Car(1111, "Niva", true),
                new Car(2222, "Kalina", false),
                new Car(3333, "xRay", false));
        return cars;
    }
}

package com.goras.graphqlcars.controller;

import com.goras.graphqlcars.model.Car;
import com.goras.graphqlcars.service.CarService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarController {

    private CarService carservice;

    public CarController(CarService carservice) {
        this.carservice = carservice;
    }

    @QueryMapping
    public String hello() {
        return "Hello, world!";
    }

    @QueryMapping
    public List<Car> getAllCars() {
        return carservice.findAll();
    }

    @QueryMapping
    public Car getCarById(@Argument int id) {
        return carservice.findById(id);
    }

    @MutationMapping
    public Car addCar(@Argument Car car) {
        return carservice.save(car);
    }

    @MutationMapping
    public Car updateCar(@Argument Car car) {
        return carservice.updateCar(car);
    }

    @MutationMapping
    public Boolean deleteCar(@Argument int id) {
        Car carToDelete = carservice.findById(id);
        if (carToDelete != null) {
            carservice.delete(carToDelete);
            return true;
        }
        return false;
    }

}

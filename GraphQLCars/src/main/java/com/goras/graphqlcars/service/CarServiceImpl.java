package com.goras.graphqlcars.service;

import com.goras.graphqlcars.model.Car;
import com.goras.graphqlcars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car findById(int id) {
        Optional<Car> car = carRepository.findById(id);
        Car foundCar = null;
        if (car.isPresent()) {
            foundCar = car.get();
        }
        return foundCar;
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car save(Car car) {
        car.setId(0);
        return carRepository.save(car);
    }

    @Override
    public Car updateCar(Car car) {
        Optional<Car> optionalCar = carRepository.findById(car.getId());
        if (optionalCar.isPresent()) {
            return carRepository.save(car);
        }
        return null;
    }

    @Override
    public void delete(Car car) {
        carRepository.delete(car);
    }
}

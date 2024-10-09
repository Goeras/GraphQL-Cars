package com.goras.graphqlcars.service;

import com.goras.graphqlcars.model.Car;

import java.util.List;

public interface CarService {

    Car findById(int id);
    List<Car> findAll();
    Car save(Car car);

    Car updateCar(Car car);

    void delete(Car car);
}

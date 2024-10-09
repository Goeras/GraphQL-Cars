package com.goras.graphqlcars.repository;

import com.goras.graphqlcars.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}

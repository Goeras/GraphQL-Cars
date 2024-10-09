package com.goras.graphqlcars.model;

import jakarta.persistence.*;
import lombok.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "brand")
    private String brand;
    @Column(name  = "model")
    private String model;
    @Column(name = "model_year")
    private int modelYear;
    @Column(name = "details")
    private String details;

}

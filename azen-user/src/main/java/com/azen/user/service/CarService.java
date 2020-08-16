package com.azen.user.service;

import com.azen.user.bean.Car;

import java.util.List;

public interface CarService {
    Integer addCar(Car car);

    Integer addCarCount(Car car);

    Car carId(Car car);

    Integer updateCar(Car car);

    List<Car> carForUid(Integer id);

    Integer deleteCarForCId(Integer id);

    Integer deleteCarForIdIsListId(List<Integer> id);
}

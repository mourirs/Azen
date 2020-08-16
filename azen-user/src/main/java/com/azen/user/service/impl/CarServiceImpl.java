package com.azen.user.service.impl;

import com.azen.user.bean.Car;
import com.azen.user.dao.CarMapper;
import com.azen.user.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = {Exception.class})
public class CarServiceImpl implements CarService {

    private final CarMapper carMapper;

    @Autowired
    public CarServiceImpl(CarMapper carMapper) {
        this.carMapper = carMapper;
    }

    @Override
    public Integer addCar(Car car) {
        return carMapper.addCar(car);
    }

    @Override
    public Integer addCarCount(Car car) {
        return carMapper.addCarCount(car);
    }

    @Override
    public Car carId(Car car) {
        return carMapper.carId(car);
    }

    @Override
    public Integer updateCar(Car car) {
        return carMapper.updateCar(car);
    }

    @Override
    public List<Car> carForUid(Integer id) {
        return carMapper.carForUid(id);
    }

    @Override
    public Integer deleteCarForCId(Integer id) {
        return carMapper.deleteCarForCId(id);
    }

    @Override
    public Integer deleteCarForIdIsListId(List<Integer> id) {
        return carMapper.deleteCarForIdIsListId(id);
    }
}

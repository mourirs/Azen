package com.azen.user.dao;

import com.azen.user.bean.Car;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CarMapper {

    Integer addCar(Car car);

    Integer addCarCount(Car car);

    Car carId(Car car);

    Integer updateCar(Car car);

    List<Car> carForUid(Integer id);

    Integer deleteCarForCId(Integer id);

    Integer deleteCarForIdIsListId(List<Integer> id);
}

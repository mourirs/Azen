package com.azen.user.controller;

import com.azen.user.bean.Car;
import com.azen.user.service.CarService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("addCar")
    public Boolean addCar(Car car, HttpServletRequest request) {
        car.setUId((Integer) request.getSession().getAttribute("userId"));
        if (carService.addCarCount(car) == 0) {
            return carService.addCar(car) > 0;
        } else {
            Car car1 = carService.carId(car);
            car1.setCNum(car1.getCNum() + car.getCNum());
            return carService.updateCar(car1) > 0;
        }
    }

    @PostMapping("updateCar")
    public Boolean updateCar(Car car) {
        return carService.updateCar(car) > 0;
    }

    @PostMapping("carPageInfo")
    public PageInfo<Car> carPageInfo(@RequestParam(defaultValue = "1", name = "pageNumber") Integer pageNumber, HttpServletRequest request) {
        PageHelper.startPage(pageNumber, 5);
        return new PageInfo<>(carService.carForUid((Integer) request.getSession().getAttribute("userId")));
    }

    @PostMapping("deleteCarForCId")
    public Boolean deleteCarForCId(Integer id) {
        return carService.deleteCarForCId(id) > 0;
    }

}

package com.azen.user.controller;

import com.azen.user.bean.Address;
import com.azen.user.service.AddressService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class AddressController {
    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("insertInFo")
    public Boolean insertInFo(Address address, HttpServletRequest request) {
        address.setUId((Integer) request.getSession().getAttribute("userId"));
        return addressService.insertInFo(address) > 0;
    }

    @PostMapping("addressPageInfo")
    public PageInfo<Address> addressPageInfo(@RequestParam(defaultValue = "1", name = "pageNumber") Integer pageNumber, HttpServletRequest request) {
        PageHelper.startPage(pageNumber, 2);
        return new PageInfo<>(addressService.addressInFo((Integer) request.getSession().getAttribute("userId")));
    }

    @PostMapping("addressList")
    public List<Address> addressList(HttpServletRequest request) {
        return addressService.addressInFo((Integer) request.getSession().getAttribute("userId"));
    }

    @PostMapping("deleteAddressInFo")
    public Boolean deleteAddressInFo(Integer id) {
        return addressService.deleteAddressInFo(id) > 0;
    }

    @PostMapping("updateAddressInFo")
    public Boolean updateAddressInFo(Address address, HttpServletRequest request) {
        return addressService.updateAddressInFo(address) > 0;
    }
}

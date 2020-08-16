package com.azen.user.service;

import com.azen.user.bean.Address;

import java.util.List;

public interface AddressService {
    Integer insertInFo(Address address);

    List<Address> addressInFo(Integer id);

    Integer deleteAddressInFo(Integer id);

    Integer updateAddressInFo(Address address);
}

package com.azen.user.service.impl;

import com.azen.user.bean.Address;
import com.azen.user.dao.AddressMapper;
import com.azen.user.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = {Exception.class})
public class AddressServiceImpl implements AddressService {
    private final AddressMapper addressMapper;

    @Autowired
    public AddressServiceImpl(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    @Override
    public Integer insertInFo(Address address) {
        return addressMapper.insertInFo(address);
    }

    @Override
    public List<Address> addressInFo(Integer id) {
        return addressMapper.addressInFo(id);
    }

    @Override
    public Integer deleteAddressInFo(Integer id) {
        return addressMapper.deleteAddressInFo(id);
    }

    @Override
    public Integer updateAddressInFo(Address address) {
        return addressMapper.updateAddressInFo(address);
    }
}

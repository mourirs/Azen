package com.azen.user.dao;

import com.azen.user.bean.Address;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Mapper
@ResponseBody
public interface AddressMapper {

    Integer insertInFo(Address address);

    List<Address> addressInFo(Integer id);

    Integer deleteAddressInFo(Integer id);

    Integer updateAddressInFo(Address address);
}

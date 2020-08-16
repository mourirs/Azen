package com.azen.user.dao;

import com.azen.user.bean.Contact;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ContactMapper {
    @Insert("INSERT INTO `shop`.`sp_contact`(`ctname`, `ctemail`, `ctmessage`) VALUES (#{ctName}, #{ctEmail}, #{ctMessage})")
    Integer insertContactInFo(Contact contact);
}

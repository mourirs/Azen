package com.azen.user.dao;

import com.azen.user.bean.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {

    Integer insertAccountInFo(Account account);

    List<Account> accountInFo(Integer id);

    Integer deleteAccountInFo(Integer id);

    Integer updateAccountInFo(Account account);

    Integer selectAccountBalance(Integer id);
}

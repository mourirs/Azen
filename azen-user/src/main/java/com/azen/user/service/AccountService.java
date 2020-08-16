package com.azen.user.service;

import com.azen.user.bean.Account;

import java.util.List;

public interface AccountService {

    Integer insertAccountInFo(Account account);

    List<Account> accountInFo(Integer id);

    Integer deleteAccountInFo(Integer id);

    Integer updateAccountInFo(Account account);

    Integer selectAccountBalance(Integer id);

}

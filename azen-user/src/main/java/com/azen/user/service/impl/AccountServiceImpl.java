package com.azen.user.service.impl;

import com.azen.user.bean.Account;
import com.azen.user.dao.AccountMapper;
import com.azen.user.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = {Exception.class})
public class AccountServiceImpl implements AccountService {

    private final AccountMapper accountMapper;

    @Autowired
    public AccountServiceImpl(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public Integer insertAccountInFo(Account account) {
        return accountMapper.insertAccountInFo(account);
    }

    @Override
    public List<Account> accountInFo(Integer id) {
        return accountMapper.accountInFo(id);
    }

    @Override
    public Integer deleteAccountInFo(Integer id) {
        return accountMapper.deleteAccountInFo(id);
    }

    @Override
    public Integer updateAccountInFo(Account account) {
        return accountMapper.updateAccountInFo(account);
    }

    @Override
    public Integer selectAccountBalance(Integer id) {
        return accountMapper.selectAccountBalance(id);
    }
}

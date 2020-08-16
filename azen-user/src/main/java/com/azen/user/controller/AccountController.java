package com.azen.user.controller;

import com.azen.user.bean.Account;
import com.azen.user.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("insertAccountInFo")
    public Boolean insertAccountInFo(Account account, HttpServletRequest request) {
        account.setUId((Integer) request.getSession().getAttribute("userId"));
        return accountService.insertAccountInFo(account) > 0;
    }

    @PostMapping("accountInFo")
    public List<Account> accountInFo(HttpServletRequest request) {
        return accountService.accountInFo((Integer) request.getSession().getAttribute("userId"));
    }

    @PostMapping("deleteAccountInFo")
    public Boolean deleteAccountInFo(Integer id) {
        return accountService.deleteAccountInFo(id) > 0;
    }

    @PostMapping("updateAccountInFo")
    public Boolean updateAccountInFo(Account account) {
        Integer integer = accountService.selectAccountBalance(account.getAId());
        if (integer != null) {
            account.setABalance(String.valueOf(integer + Integer.parseInt(account.getABalance())));
        }
        return accountService.updateAccountInFo(account) > 0;

    }

    @PostMapping("updateAccountInFos")
    public Integer updateAccountInFos(Account account, HttpServletRequest request) {
        List<Account> userId = accountService.accountInFo((Integer) request.getSession().getAttribute("userId"));
        String aBalance = account.getABalance();
        account.setABalance("0");
        for (Account value : userId) {
            account.setAId(value.getAId());
            accountService.updateAccountInFo(account);
        }
        account.setABalance(aBalance);
        account.setAId(userId.get(0).getAId());
        return accountService.updateAccountInFo(account);
    }
}

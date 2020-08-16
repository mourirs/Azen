package com.azen.user.service;

import com.azen.user.bean.Aspiration;

import java.util.List;

public interface AspirationService {
    Integer addAspiration(Aspiration aspiration);

    Integer addAspirationCount(Aspiration aspiration);

    List<Aspiration> aspirationListInFo(Integer id);

    Integer deleteAspirationInFo(Integer id);
}

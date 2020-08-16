package com.azen.user.service.impl;

import com.azen.user.bean.Aspiration;
import com.azen.user.dao.AspirationMapper;
import com.azen.user.service.AspirationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = {Exception.class})
public class AspirationServiceImpl implements AspirationService {

    private final AspirationMapper aspirationMapper;

    @Autowired
    public AspirationServiceImpl(AspirationMapper aspirationMapper) {
        this.aspirationMapper = aspirationMapper;
    }

    @Override
    public Integer addAspiration(Aspiration aspiration) {
        return aspirationMapper.addAspiration(aspiration);
    }

    @Override
    public Integer addAspirationCount(Aspiration aspiration) {
        return aspirationMapper.addAspirationCount(aspiration);
    }

    @Override
    public List<Aspiration> aspirationListInFo(Integer id) {
        return aspirationMapper.aspirationListInFo(id);
    }

    @Override
    public Integer deleteAspirationInFo(Integer id) {
        return aspirationMapper.deleteAspirationInFo(id);
    }
}

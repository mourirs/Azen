package com.azen.user.service.impl;

import com.azen.user.bean.Contact;
import com.azen.user.dao.ContactMapper;
import com.azen.user.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = {Exception.class})
public class ContactServiceImpl implements ContactService {

    private final ContactMapper contactMapper;

    @Autowired
    public ContactServiceImpl(ContactMapper contactMapper) {
        this.contactMapper = contactMapper;
    }

    @Override
    public Integer insertContactInFo(Contact contact) {
        return contactMapper.insertContactInFo(contact);
    }
}

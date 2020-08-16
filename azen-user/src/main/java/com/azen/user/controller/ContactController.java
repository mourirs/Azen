package com.azen.user.controller;

import com.azen.user.bean.Contact;
import com.azen.user.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("insertContactInFo")
    public Boolean insertContactInFo(Contact contact) {
        return contactService.insertContactInFo(contact) > 0;
    }
}

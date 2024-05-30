package com.bitespeed.ir.service;

import com.bitespeed.ir.constant.enums.LinkPrecedence;
import com.bitespeed.ir.dto.req.IdentityReq;
import com.bitespeed.ir.model.Contact;
import com.bitespeed.ir.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public Contact identity(IdentityReq req){
        var contact = Contact.builder()
                .emailId(req.getEmailId())
                .phoneNumber(req.getPhoneNumber())
                .linkPrecedence(LinkPrecedence.PRIMARY)
                .build();
        log.info("Creating contact entry : {}", contact);
        return contactRepository.save(contact);
    }
}

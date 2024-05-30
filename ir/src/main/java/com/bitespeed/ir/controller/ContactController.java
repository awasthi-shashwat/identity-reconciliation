package com.bitespeed.ir.controller;

import com.bitespeed.ir.model.Contact;
import com.bitespeed.ir.service.ContactService;
import com.bitespeed.ir.dto.req.IdentityReq;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;


    @PostMapping("/identity")
    ResponseEntity<Contact> identity(@RequestBody IdentityReq contact){
        return ResponseEntity.ok(contactService.identity(contact));
    }
}

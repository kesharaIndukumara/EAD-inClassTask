package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.UserCompany;
import edu.icet.ecom.service.UserCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCompanyController {

    @Autowired
    UserCompanyService service;

    @PostMapping
    public void add(@RequestBody UserCompany userCompany){
        service.add(userCompany);
    }
}

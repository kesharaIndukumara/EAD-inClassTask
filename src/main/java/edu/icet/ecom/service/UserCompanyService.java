package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.UserCompany;
import edu.icet.ecom.model.entity.UserCompanyEntity;
import edu.icet.ecom.repository.UserCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCompanyService {

    @Autowired
    UserCompanyRepository repository;

    public void add(UserCompany userCompany){
        UserCompanyEntity entity =new UserCompanyEntity();

        entity.setId(userCompany.getId());
        entity.setCompany(userCompany.getCompany());
        entity.setRole(userCompany.getRole());
        entity.setAppliedDate(userCompany.getAppliedDate());
        entity.setStatus(userCompany.getStatus());
        entity.setContactEmail(userCompany.getContactEmail());
        entity.setNotes(userCompany.getNotes());

        repository.save(entity);
    }

}

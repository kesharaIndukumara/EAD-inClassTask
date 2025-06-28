package edu.icet.ecom.repository;

import edu.icet.ecom.model.entity.UserCompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCompanyRepository extends JpaRepository<UserCompanyEntity, Long>{}

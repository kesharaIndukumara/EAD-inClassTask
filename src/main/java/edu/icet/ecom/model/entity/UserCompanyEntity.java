package edu.icet.ecom.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

@Entity
@Table(name = "userCompany")
public class UserCompanyEntity {
    @Id
    private Long id;
    private String company;
    private String role;
    private LocalDate appliedDate;
    private Enum status;
    private String contactEmail;
    private String notes;
}

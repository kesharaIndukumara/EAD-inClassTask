package edu.icet.ecom.model.dto;

import edu.icet.ecom.model.enums.status;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class UserCompany {
    private Long id;
    private String company;
    private String role;
    private LocalDate appliedDate;
    private Enum<status> status;
    private String contactEmail;
    private String  notes;
}

package com.br.parkegiro.api.Model.Admin.dto;

import com.br.parkegiro.api.Model.Admin.Admin;
import com.br.parkegiro.api.Model.Company.dto.CompanyGetOneAdminDTO;

public record AdminGetOneDTO(
        Long id,
        String name,
        String surname,
        String cpf,
        String phoneNumber,
        String email,
        CompanyGetOneAdminDTO company
) {
    public AdminGetOneDTO(Admin admin) {
        this(admin.id, admin.name, admin.surname, admin.cpf, admin.phoneNumber, admin.email, new CompanyGetOneAdminDTO(admin.company));
    }
}

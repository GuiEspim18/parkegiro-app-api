package com.br.parkegiro.api.Model.Admin.dto;

import com.br.parkegiro.api.Model.Company.dto.CompanyAddDTO;

public record AdminAddDTO(
        String name,
        String surname,
        String cpf,
        String phoneNumber,
        String email,
        String password,
        CompanyAddDTO company
) {
}

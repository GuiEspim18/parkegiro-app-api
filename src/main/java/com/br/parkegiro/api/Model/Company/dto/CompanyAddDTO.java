package com.br.parkegiro.api.Model.Company.dto;

import com.br.parkegiro.api.Model.Logo.dto.LogoAddDTO;

public record CompanyAddDTO(
        String name,
        String commercialName,
        String cnpj,
        LogoAddDTO logo
) {
}

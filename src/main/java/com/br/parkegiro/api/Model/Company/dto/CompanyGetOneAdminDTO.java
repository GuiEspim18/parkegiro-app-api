package com.br.parkegiro.api.Model.Company.dto;

import com.br.parkegiro.api.Model.Company.Company;
import com.br.parkegiro.api.Model.Logo.dto.LogoGetOneDTO;

public record CompanyGetOneAdminDTO(
        String name,
        String commercialName,
        String cnpj,
        LogoGetOneDTO logo
) {
    public CompanyGetOneAdminDTO(Company company) {
        this(company.name, company.commercialName, company.cnpj, new LogoGetOneDTO(company.logo));
    }
}

package com.br.parkegiro.api.Model.Company.dto;

import com.br.parkegiro.api.Model.Company.Company;

public record CompanyGetOneAdminDTO(
        String name,
        String commercialName,
        String cnpj
) {
    public CompanyGetOneAdminDTO(Company company) {
        this(company.name, company.commercialName, company.cnpj);
    }
}

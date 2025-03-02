package com.br.parkegiro.api.Model.Company;

import com.br.parkegiro.api.Model.Company.dto.CompanyAddDTO;
import com.br.parkegiro.api.Model.Logo.Logo;
import jakarta.persistence.*;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    public String commercialName;
    public String cnpj;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "logo_id", referencedColumnName = "id")
    public Logo logo;

    public Company() {
    }

    public Company(CompanyAddDTO company) {
        this.name = company.name();
        this.commercialName = company.commercialName();
        this.cnpj = company.cnpj();
        if (company.logo() != null) {
            this.logo = new Logo(company.logo());
        }
    }

}

package com.br.parkegiro.api.Model.Company;

import com.br.parkegiro.api.Model.Admin.Admin;
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

}

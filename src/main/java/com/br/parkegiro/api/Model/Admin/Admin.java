package com.br.parkegiro.api.Model.Admin;

import com.br.parkegiro.api.Model.Admin.dto.AdminAddDTO;
import com.br.parkegiro.api.Model.Company.Company;
import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    public String surname;
    public String cpf;
    public String phoneNumber;
    public String email;
    private String password;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    public Company company;

    public Admin(AdminAddDTO admin) {
        this.name = admin.surname();
        this.surname = admin.surname();
        this.cpf = admin.cpf();
        this.phoneNumber = admin.phoneNumber();
        this.email = admin.email();
        this.password = admin.password();
    }
}

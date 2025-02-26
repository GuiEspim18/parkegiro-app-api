package com.br.parkegiro.api.Model.Admin;

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


}

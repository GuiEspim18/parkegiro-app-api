package com.br.parkegiro.api.Model.Address;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String cep;
    public String street;
    public String number;
    public String neighborhood;
    public String city;

}

package com.br.parkegiro.api.Model.Logo;

import com.br.parkegiro.api.Model.Company.Company;
import jakarta.persistence.*;

@Entity
@Table(name = "logo")
public class Logo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String fileName;

}

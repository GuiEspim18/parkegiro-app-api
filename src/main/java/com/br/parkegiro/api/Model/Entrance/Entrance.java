package com.br.parkegiro.api.Model.Entrance;

import jakarta.persistence.*;

@Entity
@Table(name = "entrance")
public class Entrance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

}

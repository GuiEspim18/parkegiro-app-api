package com.br.parkegiro.api.Model.Unit;

import com.br.parkegiro.api.Model.Address.Address;
import com.br.parkegiro.api.Model.Entrance.Entrance;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "unit")
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    public Address address;

    @OneToMany(mappedBy = "id")
    public List<Entrance> parkingLot;

}

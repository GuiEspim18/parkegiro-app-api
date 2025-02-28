package com.br.parkegiro.api.Model.Admin.dto;

public record AdminAddDTO(
        String name,
        String surname,
        String cpf,
        String phoneNumber,
        String email,
        String password
) {
}

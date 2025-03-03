package com.br.parkegiro.api.Model.Logo.dto;

import com.br.parkegiro.api.Model.Logo.Logo;

public record LogoGetOneDTO(
        Long id,
        String fileName
) {
    public LogoGetOneDTO (Logo logo) {
        this(logo.id, logo.fileName);
    }
}

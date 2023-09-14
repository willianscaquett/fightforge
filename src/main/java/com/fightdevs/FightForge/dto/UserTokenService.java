package com.fightdevs.FightForge.dto;

import jakarta.validation.constraints.Email;

public record UserTokenService (
        @Email(message = "Informe seu email de acesso")
        String email,
        String senha
) {
}

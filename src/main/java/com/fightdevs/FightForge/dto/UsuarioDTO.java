package com.fightdevs.FightForge.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;


/**
 *
 * @author Willian Scaquett
 */
@Data

public class UsuarioDTO{
    Long id;
    String email;
    String senha;
    Date dataNascimento;
    char sexo;
    String nome;
    String codigo;
}

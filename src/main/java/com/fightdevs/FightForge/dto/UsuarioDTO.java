package com.fightdevs.FightForge.dto;

import lombok.Data;
import java.util.Date;

/**
 *
 * @author Willian Scaquett
 */
@Data

public class UsuarioDTO{
    String email;
    String senha;
    Date dataNascimento;
    char sexo;
    String nome;
    TipoUsuario usuarioType;
    String codigo;
}

package com.fightdevs.FightForge.dto;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author Willian Scaquett
 */
@Data
public class UsuarioDTO {
    
    String email;
    String senha;
    Date dataNascimento;
    char sexo;
    String nome;
    
}

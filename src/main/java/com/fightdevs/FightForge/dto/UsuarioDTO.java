package com.fightdevs.FightForge.dto;

import com.fightdevs.FightForge.entity.Usuario;
import lombok.Data;

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
    TipoUsuario tipo;
    String codigo;
    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.email = usuario.getEmail();
        this.dataNascimento = usuario.getDataNascimento();
        this.sexo = usuario.getSexo();
        this.nome = usuario.getNome();
        this.tipo = usuario.getTipo();
    }
}

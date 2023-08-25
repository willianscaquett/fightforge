package com.fightdevs.FightForge.entity;

import com.fightdevs.FightForge.dto.UsuarioDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author Willian Scaquett
 */
@Data
@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "SENHA")
    private String senha;

    @Column(name = "DATANASCIMENTO")
    private Date dataNascimento;

    @Column(name = "SEXO")
    private char sexo;

    @Column(name = "NOME")
    private String nome;

    public Usuario(UsuarioDTO usuarioDTO) {
        this.email = usuarioDTO.getEmail();
        this.senha = usuarioDTO.getSenha();
        this.dataNascimento = usuarioDTO.getDataNascimento();
        this.sexo = usuarioDTO.getSexo();
        this.nome = usuarioDTO.getNome();
    }

}

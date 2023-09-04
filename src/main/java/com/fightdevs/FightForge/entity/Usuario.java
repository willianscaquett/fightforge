package com.fightdevs.FightForge.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fightdevs.FightForge.dto.UsuarioDTO;
import com.fightdevs.FightForge.dto.UsuarioType;
import com.fightdevs.FightForge.security.CustomGrantedAuthority;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Willian Scaquett
 */
@Entity
@Getter
@Setter
@Table(name = "USUARIO")
@NoArgsConstructor
@JsonInclude
public class Usuario implements UserDetails {

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
    @Column(name = "USUARIOTYPE")
    @Enumerated(EnumType.STRING)
    private UsuarioType usuarioType;

    public Usuario(UsuarioDTO usuario) {
        this.email = usuario.getEmail();
        this.senha = usuario.getSenha();
        this.dataNascimento = usuario.getDataNascimento();
        this.sexo = usuario.getSexo();
        this.nome = usuario.getNome();
        this.usuarioType = usuario.getUsuarioType();
    }

    @Override
    @JsonIgnore
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new CustomGrantedAuthority("ROLE_" + usuarioType.toString()));
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}

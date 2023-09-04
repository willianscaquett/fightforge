package com.fightdevs.FightForge.business;

import com.fightdevs.FightForge.dto.UserTokenService;
import com.fightdevs.FightForge.dto.UsuarioDTO;
import com.fightdevs.FightForge.entity.Usuario;
import com.fightdevs.FightForge.repository.UsuarioRepository;
import com.fightdevs.FightForge.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.security.core.Authentication;


/**
 *
 * @author Willian Scaquett
 */
@Service
public class UsuarioBO {

    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    AuthenticationManager manager;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    TokenService tokenService;
    public String createUsuario(UsuarioDTO usuario) {
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        usuarioRepository.save(new Usuario(usuario));
        return "Sucesso";
    }


    public String login(UserTokenService dto) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(dto.email(), dto.senha());
        Authentication auth = manager.authenticate(token);
        return tokenService.token((Usuario) auth.getPrincipal());
    }
}

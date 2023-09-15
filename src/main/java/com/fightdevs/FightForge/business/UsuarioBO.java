package com.fightdevs.FightForge.business;

import com.fightdevs.FightForge.dto.TipoUsuario;
import com.fightdevs.FightForge.dto.UserTokenService;
import com.fightdevs.FightForge.dto.UsuarioDTO;
import com.fightdevs.FightForge.entity.Academia;
import com.fightdevs.FightForge.entity.Usuario;
import com.fightdevs.FightForge.repository.AcademiaRepository;
import com.fightdevs.FightForge.repository.UsuarioRepository;
import com.fightdevs.FightForge.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
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
    AcademiaRepository academiaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    AuthenticationManager manager;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    TokenService tokenService;

    public String createUsuario(UsuarioDTO usuarioDTO) throws NotFoundException {

        Usuario usuario = new Usuario(usuarioDTO);

        Academia academia = academiaRepository.findByCodigoAluno(usuarioDTO.getCodigo());
        usuario.setTipo(TipoUsuario.ALUNO);

        if (academia == null) {
            academia = academiaRepository.findByCodigoProfessor(usuarioDTO.getCodigo());
            usuario.setTipo(TipoUsuario.PROFESSOR);

            if (academia == null) {
                throw new NotFoundException();
            }
        }

        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        usuario.setAcademia(academia);

        usuarioRepository.save(usuario);

        return "Sucesso";
    }

    public String login(UserTokenService dto) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(dto.email(), dto.senha());
        Authentication auth = manager.authenticate(token);
        return tokenService.token((Usuario) auth.getPrincipal());
    }
}

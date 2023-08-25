package com.fightdevs.FightForge.business;

import com.fightdevs.FightForge.dto.UsuarioDTO;
import com.fightdevs.FightForge.entity.Usuario;
import com.fightdevs.FightForge.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Willian Scaquett
 */
@Service
public class UsuarioBO {

    @Autowired
    UsuarioRepository usuarioRepository;

    public String createUsuario(UsuarioDTO usuarioDTO) {

        usuarioRepository.save(new Usuario(usuarioDTO));

        return "Sucesso";
    }

}

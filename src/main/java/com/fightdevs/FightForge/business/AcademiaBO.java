package com.fightdevs.FightForge.business;

import com.fightdevs.FightForge.dto.UsuarioDTO;
import com.fightdevs.FightForge.entity.Academia;
import com.fightdevs.FightForge.entity.TipoUsuario;
import com.fightdevs.FightForge.entity.Usuario;
import com.fightdevs.FightForge.repository.AcademiaRepository;
import com.fightdevs.FightForge.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

/**
 *
 * @author Willian Scaquett
 */
@Service
public class AcademiaBO {

    @Autowired
    AcademiaRepository academiaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    public String createUsuario(UsuarioDTO usuarioDTO) throws NotFoundException {

        return "Sucesso";
    }

}

package com.fightdevs.FightForge.business;

import com.fightdevs.FightForge.dto.AcademiaDTO;
import com.fightdevs.FightForge.entity.Academia;
import com.fightdevs.FightForge.repository.AcademiaRepository;
import com.fightdevs.FightForge.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

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

    @Autowired
    PasswordEncoder passwordEncoder;

    public String createAcademia(AcademiaDTO academiaDTO) {
        Academia academia = new Academia(academiaDTO.getNome());

        academia.setCodigoAluno(passwordEncoder.encode(academia.getNome()).substring(0, 8));
        academia.setCodigoProfessor(passwordEncoder.encode(academia.getCodigoAluno()).substring(0, 8));

        academiaRepository.save(academia);

        return "Sucesso";
    }

}

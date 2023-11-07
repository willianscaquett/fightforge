package com.fightdevs.FightForge.repository;

import com.fightdevs.FightForge.dto.UsuarioDTO;
import com.fightdevs.FightForge.entity.Academia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Willian Scaquett
 */

@Repository
public interface AcademiaRepository extends JpaRepository<Academia, Long> {

    public Academia findByCodigoAluno(String codigoAcessoAluno);
    
    public Academia findByCodigoProfessor(String codigoAcessoProfessor);





}

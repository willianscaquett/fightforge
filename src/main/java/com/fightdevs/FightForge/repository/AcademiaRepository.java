package com.fightdevs.FightForge.repository;

import com.fightdevs.FightForge.entity.Academia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Willian Scaquett
 */

@Repository
public interface AcademiaRepository extends JpaRepository<Academia, Long> {

    public Academia findByCodigoAluno(String codigoAcessoAluno);
    
    public Academia findByCodigoProfessor(String codigoAcessoProfessor);
    
}

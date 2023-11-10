package com.fightdevs.FightForge.repository;

import com.fightdevs.FightForge.entity.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kaique Queiros
 */
@Repository
public interface AgendaRepository extends JpaRepository<Agenda,Long>{
    
}

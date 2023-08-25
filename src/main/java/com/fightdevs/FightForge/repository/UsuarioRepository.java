package com.fightdevs.FightForge.repository;

import com.fightdevs.FightForge.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Willian Scaquett
 */

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}

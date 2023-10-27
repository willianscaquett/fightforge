package com.fightdevs.FightForge.repository;

import com.fightdevs.FightForge.dto.AlunoDTO;
import com.fightdevs.FightForge.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author Willian Scaquett
 */

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query(value = "SELECT * FROM USUARIO u WHERE u.tipousuario = 'ALUNO'", nativeQuery = true)
    Collection<AlunoDTO> findAllStudents();
    Usuario findByEmail(String email);
    Boolean existsByEmail(String email);
}

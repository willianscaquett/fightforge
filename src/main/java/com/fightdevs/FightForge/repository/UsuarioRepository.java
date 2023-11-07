package com.fightdevs.FightForge.repository;

import com.fightdevs.FightForge.dto.UsuarioDTO;
import com.fightdevs.FightForge.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Willian Scaquett
 */

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
    Boolean existsByEmail(String email);
    @Query(value = "SELECT u.id,u.email,u.dataNascimento,u.sexo,u.nome,u.tipoUsuario FROM Usuario u \n" +
            "\tLEFT JOIN Academia a\n" +
            "            ON a.id = u.id\n" +
            "            WHERE\n" +
            "               a.id = ?1", nativeQuery = true)
    public List<Usuario> findAllUsersByAcademia(Long id);

}

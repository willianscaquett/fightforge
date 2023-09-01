package com.fightdevs.FightForge.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author Willian Scaquett
 */
@AllArgsConstructor
@Getter
public enum TipoUsuario {
    DONO("Dono"),
    PROFESSOR("Professor"),
    ALUNO("Aluno");
    
    private String nome;
}

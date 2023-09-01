package com.fightdevs.FightForge.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author Willian Scaquett
 */
@Data
@Entity
@Table(name = "ACADEMIA")
public class Academia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "NOME")
    private String nome;
    
    @Column(name = "CODIGOALUNO")
    private String codigoAluno;
    
    @Column(name = "CODIGOPROFESSOR")
    private String codigoProfessor;

}

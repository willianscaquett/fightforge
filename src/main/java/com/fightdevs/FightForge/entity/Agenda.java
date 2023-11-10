package com.fightdevs.FightForge.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fightdevs.FightForge.dto.AgendaDTO;

/**
 *
 * @author Kaique Queiros
 */
@Entity
@Table(name = "AGENDA")
@Data
@NoArgsConstructor

public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDateTime data;
    private Long professor;
    
    public Agenda (AgendaDTO agenda) {
        this.nome = agenda.getNome();
        this.data = LocalDateTime.now();
        this.professor = agenda.getProfessor();
    }
    
}

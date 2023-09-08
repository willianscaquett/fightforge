package com.fightdevs.FightForge.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "NOTAS")
@NoArgsConstructor
@JsonInclude
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "MESSAGE")
    private String message;
    @Column(name = "IDALUNO")
    private Long idAluno;

}

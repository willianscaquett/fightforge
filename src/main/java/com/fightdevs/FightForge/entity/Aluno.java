package com.fightdevs.FightForge.entity;

import com.fightdevs.FightForge.dto.AlunoDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@Table(name = "ALUNO")
@NoArgsConstructor
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "IDADE")
    private int idade;
    @Column(name = "ALTURA")
    private double altura;
    @Column(name = "PESO")
    private double peso;
    @Column(name = "NOTAS")
    @OneToMany
    private List<Nota> notas;



    public Aluno (AlunoDTO alunoDTO) {
        this.nome = alunoDTO.getNome();
        this.idade = alunoDTO.getIdade();
        this.altura = alunoDTO.getAltura();
        this.peso = alunoDTO.getAltura();
    }
}

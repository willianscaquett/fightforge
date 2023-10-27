package com.fightdevs.FightForge.dto;

import com.fightdevs.FightForge.entity.Aluno;
import lombok.Data;

@Data
public class AlunoDTO {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    
    public AlunoDTO(Aluno aluno) {
        this.nome = aluno.getNome();
        this.idade = aluno.getIdade();
        this.altura = aluno.getAltura();
        this.peso = aluno.getPeso(); 
    }

}

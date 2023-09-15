package com.fightdevs.FightForge.dto;

import com.fightdevs.FightForge.entity.Nota;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class AlunoDTO {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private FaixaType faixa;

}

package com.fightdevs.FightForge.business;

import com.fightdevs.FightForge.dto.AlunoDTO;
import com.fightdevs.FightForge.entity.Aluno;
import com.fightdevs.FightForge.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoBO {

    @Autowired
    private AlunoRepository alunoRepository;

    public String createAluno(AlunoDTO alunoDTO) {
        alunoRepository.save(new Aluno(alunoDTO));
        return "Sucesso";
    }
}

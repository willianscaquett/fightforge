package com.fightdevs.FightForge.controller;

import com.fightdevs.FightForge.business.AlunoBO;
import com.fightdevs.FightForge.dto.AlunoDTO;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private AlunoBO alunoBO;

    @PostMapping
    @SecurityRequirement(name = "bearer-key")
    public ResponseEntity<?> createAluno(@RequestBody AlunoDTO alunoDTO) {
        try {
            return ResponseEntity.ok(alunoBO.createAluno(alunoDTO));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}

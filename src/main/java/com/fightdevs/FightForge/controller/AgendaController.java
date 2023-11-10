package com.fightdevs.FightForge.controller;

import com.fightdevs.FightForge.business.AgendaBO;
import com.fightdevs.FightForge.dto.AgendaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Kaique Queiros
 */
@RestController
@RequestMapping("/agenda")
public class AgendaController {
    @Autowired
    private AgendaBO agendaBO;
    
    @PostMapping
    public ResponseEntity<?> createAgenda(AgendaDTO agendaDTO) {
        try {
            return ResponseEntity.ok(agendaBO.criacaoAgenda(agendaDTO));
        } catch(Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }   
}

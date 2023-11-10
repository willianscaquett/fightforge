/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fightdevs.FightForge.business;

import com.fightdevs.FightForge.dto.AgendaDTO;
import com.fightdevs.FightForge.entity.Agenda;
import com.fightdevs.FightForge.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kaique Queiros
 */
@Service
public class AgendaBO {
    
    @Autowired
    private AgendaRepository agendaRepository;
    
    
    public String criacaoAgenda(AgendaDTO agendaDTO) {
        Agenda agenda = new Agenda(agendaDTO);
        agendaRepository.save(agenda);
        return "Sucesso";
    }
}

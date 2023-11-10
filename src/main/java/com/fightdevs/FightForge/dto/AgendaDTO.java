package com.fightdevs.FightForge.dto;

import com.fightdevs.FightForge.entity.Usuario;
import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * @author Kaique Queiros
 */
@Data
public class AgendaDTO {
    String nome;
    Long professor;   
}

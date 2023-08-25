package com.fightdevs.FightForge.controller;

import com.fightdevs.FightForge.business.UsuarioBO;
import com.fightdevs.FightForge.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Willian Scaquett
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioBO usuarioBO;
    
    @PostMapping
    public ResponseEntity<?> createUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        
        try {
            return ResponseEntity.ok(usuarioBO.createUsuario(usuarioDTO));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        } 
    }
    
}

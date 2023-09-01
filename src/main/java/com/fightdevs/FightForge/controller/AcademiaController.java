package com.fightdevs.FightForge.controller;

import com.fightdevs.FightForge.dto.UsuarioDTO;
import com.fightdevs.FightForge.entity.Academia;
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
@RequestMapping("/academia")
public class AcademiaController {

    @Autowired
    Academia academiaBO;

    @PostMapping("cadastro")
    public ResponseEntity<?> createUsuario(@RequestBody UsuarioDTO usuarioDTO) {

        try {
            return ResponseEntity.ok(academiaBO.createEmpresa(usuarioDTO));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }

}

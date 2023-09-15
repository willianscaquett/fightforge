package com.fightdevs.FightForge.controller;

import com.fightdevs.FightForge.business.AcademiaBO;
import com.fightdevs.FightForge.dto.AcademiaDTO;
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
    AcademiaBO academiaBO;

    @PostMapping("cadastro")
    public ResponseEntity<?> createAcademia(@RequestBody AcademiaDTO academiaDTO) {

        try {
            return ResponseEntity.ok(academiaBO.createAcademia(academiaDTO));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }

}

package com.fightdevs.FightForge.controller;

import com.fightdevs.FightForge.business.UsuarioBO;
import com.fightdevs.FightForge.dto.UserTokenService;
import com.fightdevs.FightForge.dto.UsuarioDTO;
import com.fightdevs.FightForge.entity.Usuario;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
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

    @PostMapping("/cadastro")
    @Operation(summary = "Atraves desse endpoint os usuarios do sistema são criados", tags = "User")
    @SecurityRequirement(name = "bearer-key")
    public ResponseEntity<?> createUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        try {
            return ResponseEntity.ok(usuarioBO.createUsuario(usuarioDTO));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping(value = "/login")
    @Operation(summary = "Login na api e fornecendo o JTW", tags = "User")
    public ResponseEntity<?> login(@RequestBody @Valid UserTokenService dto) {
        try {
            return ResponseEntity.ok(usuarioBO.login(dto));
        }catch (Exception exception) {
            return ResponseEntity.internalServerError().body(exception.getMessage());
        }
    }
}

package com.apidaiquiriclub.daiquiriclub.Controller;

import com.apidaiquiriclub.daiquiriclub.Model.DTO.UsuarioDto;
import com.apidaiquiriclub.daiquiriclub.Service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @GetMapping("/usuario")
    public ResponseEntity<List<UsuarioDto>> getAllUsuario() {
        List<UsuarioDto> usuarios = usuarioService.getAllUsuarios();
        return ResponseEntity.ok(usuarios);
    }
}

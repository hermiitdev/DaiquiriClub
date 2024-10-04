package com.apidaiquiriclub.daiquiriclub.Controller;

import com.apidaiquiriclub.daiquiriclub.Model.DTO.RolDto;
import com.apidaiquiriclub.daiquiriclub.Service.RolService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuario")
public class RolController {
    private final RolService rolService;

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }
    @GetMapping("")
    public ResponseEntity<List<RolDto>> getAllRol(){
        List<RolDto> rols = rolService.getAllRol();
        return ResponseEntity.ok(rols);
    }
}

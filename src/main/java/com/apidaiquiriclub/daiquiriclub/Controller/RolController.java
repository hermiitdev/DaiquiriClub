package com.apidaiquiriclub.daiquiriclub.Controller;

import com.apidaiquiriclub.daiquiriclub.Model.DTO.RolDto;
import com.apidaiquiriclub.daiquiriclub.Service.RolService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RolController {
    private final RolService rolService;

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }
    @GetMapping("/rol")
    public ResponseEntity<List<RolDto>> getAllRol(){
        List<RolDto> rols = rolService.getAllRol();
        return ResponseEntity.ok(rols);
    }
    @GetMapping("/rol/{id}")
    public ResponseEntity<RolDto> getRolById(@PathVariable int id){
        RolDto rol = rolService.getRolById(id);
        return ResponseEntity.ok(rol);
    }
    @PostMapping("/rol")
    public ResponseEntity<RolDto> addRol(@RequestBody RolDto rolDto){
        RolDto rol = rolService.addRol(rolDto);
        return ResponseEntity.ok(rol);
    }
    @PutMapping("/rol/{id}")
    public ResponseEntity<RolDto> updateRol(@PathVariable int id, @RequestBody RolDto rolDto){
        RolDto rol = rolService.updateRol(id, rolDto);
        return ResponseEntity.ok(rol);
    }
    @DeleteMapping("/rol/{id}")
    public ResponseEntity<String> deleteRol(@PathVariable int id){
        return ResponseEntity.ok("Se eliminó correctamente el rol");
    }
}

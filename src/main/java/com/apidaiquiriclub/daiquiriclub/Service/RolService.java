package com.apidaiquiriclub.daiquiriclub.Service;

import com.apidaiquiriclub.daiquiriclub.Model.DTO.RolDto;
import com.apidaiquiriclub.daiquiriclub.Model.Entity.Rol;
import com.apidaiquiriclub.daiquiriclub.Repository.RolRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RolService {
    private final RolRepository rolRepository;

    public RolService(
            RolRepository rolRepository
    ) {
        this.rolRepository = rolRepository;
    }
    public List<RolDto> getAllRol() {
        List<Rol> rols = rolRepository.findAll();
        return rols.stream().map(
                rol -> new RolDto(rol.getId(),rol.getNombre())
        ).toList();
    }
    public RolDto getRolById (int id){
        Optional<Rol> rolOp = rolRepository.findById(id);

        if(rolOp.isPresent()){
            Rol rol = rolOp.get();
            return new RolDto(rol.getId(),rol.getNombre());
        }
        return null;
    }
    public RolDto addRol(RolDto rolDto) {
        Rol rol = new Rol();
        rol.setNombre(rolDto.getNombre());
        rolRepository.save(rol);
        return new RolDto(rol.getId(),rol.getNombre());
    }
    public RolDto updateRol (int id, RolDto rolDto) {
        Optional<Rol> rolOp = rolRepository.findById(id);
        if(rolOp.isPresent()){
            Rol rol = rolOp.get();
            rol.setNombre(rolDto.getNombre());
            rolRepository.save(rol);
            return new RolDto(rolDto.getId(),rolDto.getNombre());
        }
        return null;
    }
    public void deleteRol(int id){
        Optional<Rol> rolOp = rolRepository.findById(id);
        if (rolOp.isPresent()){
            Rol rol = rolOp.get();
            rolRepository.deleteById(rol.getId());
        }
    }
}















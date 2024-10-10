package com.apidaiquiriclub.daiquiriclub.Service;

import com.apidaiquiriclub.daiquiriclub.Model.DTO.RolDto;
import com.apidaiquiriclub.daiquiriclub.Model.DTO.UsuarioDto;
import com.apidaiquiriclub.daiquiriclub.Model.Entity.Rol;
import com.apidaiquiriclub.daiquiriclub.Model.Entity.Usuario;
import com.apidaiquiriclub.daiquiriclub.Repository.RolRepository;
import com.apidaiquiriclub.daiquiriclub.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final RolRepository rolRepository;

    public UsuarioService(UsuarioRepository usuarioRepository, RolRepository rolRepository) {
        this.usuarioRepository = usuarioRepository;
        this.rolRepository = rolRepository;
    }
    public List<UsuarioDto> getAllUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();

        List<Rol> rols = rolRepository.findAll();

        List<RolDto> rolDtos = rols.stream().map(rol -> new RolDto(rol.getId(),rol.getNombre())).toList();

        return usuarios.stream().map(
                user -> new UsuarioDto(user.getId(),user.getNombre(), user.getEmail(),rolDtos)
        ).toList();
    }
}

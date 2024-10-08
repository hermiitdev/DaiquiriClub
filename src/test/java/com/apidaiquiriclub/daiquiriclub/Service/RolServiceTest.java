package com.apidaiquiriclub.daiquiriclub.Service;

import com.apidaiquiriclub.daiquiriclub.Model.DTO.RolDto;
import com.apidaiquiriclub.daiquiriclub.Model.Entity.Rol;
import com.apidaiquiriclub.daiquiriclub.Repository.RolRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RolServiceTest {

    @Mock
    private RolRepository rolRepository;
    @InjectMocks
    private RolService rolService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getAllRol() {
        List<Rol> roles = Arrays.asList(
                new Rol(1,"ROL 1"),
                new Rol(2,"ROL 2")
        );
        when(rolRepository.findAll()).thenReturn(roles);

        List<RolDto> resultado = rolService.getAllRol();

        assertNotNull(resultado);
        assertEquals(2, resultado.size());
        assertEquals("ROL 1",resultado.get(0).getNombre());
        assertEquals("ROL 2",resultado.get(1).getNombre());
    }

    @Test
    void getRolById() {
        int rolId = 1;

        Rol rol = new Rol("Rol 1");

        rol.setId(rolId);

        when(rolRepository.findById(rolId)).thenReturn(Optional.of(rol));

        RolDto resultado = rolService.getRolById(rolId);

        assertNotNull(resultado);
        assertEquals(rolId, resultado.getId());
        assertEquals("Rol 1", resultado.getNombre());

        verify(rolRepository,times(1)).findById(rolId);
    }

    @Test
    void deleteRol() {
    }

    @Test
    void updateRol() {
    }
}
package com.apidaiquiriclub.daiquiriclub.Model.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioDto {
    private Integer id;
    @NotBlank(message = "El nombre es obligatorio")
    private Integer nombre;
    @NotBlank(message = "El email es obligatorio")
    @Email(message = "El email debe ser correcto")
    private String email;
    @NotBlank(message = "La contraseña es obligatorio")
    private String password;
    @Size(min = 1, message = "Debe ser almenos 1 rol")
    private List<RolDto> rol = new ArrayList<>();
}

package com.apidaiquiriclub.daiquiriclub.Model.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RolDto {
    private Integer id;
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
}

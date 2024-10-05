package com.apidaiquiriclub.daiquiriclub.Repository;

import com.apidaiquiriclub.daiquiriclub.Model.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}

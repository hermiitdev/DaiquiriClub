package com.apidaiquiriclub.daiquiriclub.Repository;

import com.apidaiquiriclub.daiquiriclub.Model.Entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
}

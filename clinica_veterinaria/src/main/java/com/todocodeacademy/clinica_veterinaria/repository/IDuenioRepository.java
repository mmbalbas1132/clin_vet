package com.todocodeacademy.clinica_veterinaria.repository;

import com.todocodeacademy.clinica_veterinaria.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repositorio JPA para la entidad Duenio
// Permite realizar operaciones CRUD sobre la tabla de dueños en la base de datos
@Repository // Indica que esta interfaz es un componente de acceso a datos
public interface IDuenioRepository extends JpaRepository <Duenio, Long>{
    // Hereda métodos CRUD y de consulta de JpaRepository
}

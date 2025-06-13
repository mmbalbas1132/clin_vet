package com.todocodeacademy.clinica_veterinaria.repository;

import com.todocodeacademy.clinica_veterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repositorio JPA para la entidad Mascota
// Permite realizar operaciones CRUD sobre la tabla de mascotas en la base de datos
@Repository // Indica que esta interfaz es un componente de acceso a datos
public interface IMascotaRepository extends JpaRepository<Mascota, Long>{
    // Hereda métodos CRUD y de consulta de JpaRepository
}

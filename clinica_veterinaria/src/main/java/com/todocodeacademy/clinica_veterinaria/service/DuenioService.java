package com.todocodeacademy.clinica_veterinaria.service;
import com.todocodeacademy.clinica_veterinaria.model.Duenio;
import com.todocodeacademy.clinica_veterinaria.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Implementación del servicio para la lógica de negocio relacionada con dueños
@Service // Indica que esta clase es un servicio de Spring
public class DuenioService implements IDuenioService{

    @Autowired
    private IDuenioRepository repoDuenio; // Inyección del repositorio de dueños

    @Override
    public List<Duenio> getDuenios() {
        List<Duenio> listaDuenios = repoDuenio.findAll(); // Obtiene todos los dueños de la base de datos
        return listaDuenios;
    }

    @Override
    public void saveDuenio(Duenio duenio) {
        repoDuenio.save(duenio); // Guarda un nuevo dueño o actualiza uno existente
    }

    @Override
    public void deleteDuenio(Long id) {
        repoDuenio.deleteById(id); // Elimina un dueño por su ID
    }

    @Override
    public Duenio findDuenio(Long id) {
        return repoDuenio.findById(id).orElse(null); // Busca un dueño por su ID, devuelve null si no existe
    }

    @Override
    public void editDuenio(Duenio duenio) {
        this.saveDuenio(duenio); // Edita un dueño reutilizando el método saveDuenio
    }
    
}

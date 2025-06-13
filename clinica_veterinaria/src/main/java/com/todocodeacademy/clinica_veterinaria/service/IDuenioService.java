package com.todocodeacademy.clinica_veterinaria.service;

import com.todocodeacademy.clinica_veterinaria.model.Duenio;
import java.util.List;


// Interfaz de servicio para la lógica de negocio relacionada con dueños
public interface IDuenioService {
    
    // Método para obtener la lista de todos los dueños (lectura)
    public List<Duenio> getDuenios();

    // Método para guardar un nuevo dueño (alta)
    public void saveDuenio(Duenio duenio);

    // Método para eliminar un dueño por su ID (baja)
    public void deleteDuenio(Long id);

    // Método para buscar un dueño por su ID (lectura de un solo objeto)
    public Duenio findDuenio(Long id);

    // Método para editar/modificar un dueño existente
    public void editDuenio (Duenio duenio);
    
}

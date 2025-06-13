package com.todocodeacademy.clinica_veterinaria.service;

import com.todocodeacademy.clinica_veterinaria.dto.MascoDuenioDTO;
import com.todocodeacademy.clinica_veterinaria.model.Mascota;
import java.util.List;

// Interfaz de servicio para la lógica de negocio relacionada con mascotas
public interface IMascotaService {
    
    // Método para obtener la lista de todas las mascotas (lectura)
    public List<Mascota> getMascotas();

    // Método para guardar una nueva mascota (alta)
    public void saveMascota(Mascota masco);

    // Método para eliminar una mascota por su ID (baja)
    public void deleteMascota(Long id_mascota);

    // Método para buscar una mascota por su ID (lectura de un solo objeto)
    public Mascota findMascota(Long id_mascota);

    // Método para editar/modificar una mascota existente
    public void editMascota(Mascota masco);

    // Método para obtener la lista de mascotas de raza caniche
    public List<Mascota> getCaniches();
    
    // Método para obtener la lista de mascotas junto con sus dueños (DTO)
    public List<MascoDuenioDTO> getMascoDuenios();
    
}

package com.todocodeacademy.clinica_veterinaria.service;

import com.todocodeacademy.clinica_veterinaria.dto.MascoDuenioDTO;
import com.todocodeacademy.clinica_veterinaria.model.Mascota;
import com.todocodeacademy.clinica_veterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Implementación del servicio para la lógica de negocio relacionada con mascotas
@Service // Indica que esta clase es un servicio de Spring
public class MascotaService implements IMascotaService{
    
    @Autowired
    private IMascotaRepository repoMasco; // Inyección del repositorio de mascotas

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = repoMasco.findAll(); // Obtiene todas las mascotas de la base de datos
        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota masco) {
        repoMasco.save(masco); // Guarda una nueva mascota o actualiza una existente
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        repoMasco.deleteById(id_mascota); // Elimina una mascota por su ID
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        return repoMasco.findById(id_mascota).orElse(null); // Busca una mascota por su ID, devuelve null si no existe
    }

    @Override
    public void editMascota(Mascota masco){
        // Guarda los cambios de la mascota (edición)
        this.saveMascota(masco);
    }

    @Override
    public List<Mascota> getCaniches() {
        List<Mascota> listaMascotas = this.getMascotas(); // Obtiene todas las mascotas
        List<Mascota> listaCaniches = new ArrayList<Mascota>(); // Lista para almacenar solo caniches
        // Filtra las mascotas que sean perros y de raza caniche
        for (Mascota masco:listaMascotas) {
            if (masco.getEspecie().equalsIgnoreCase("perro") && masco.getRaza().equalsIgnoreCase("caniche")) {
                listaCaniches.add(masco);
            }
        }
        return listaCaniches;
    }

    @Override
    public List<MascoDuenioDTO> getMascoDuenios() {
        List<Mascota> listaMascotas = this.getMascotas(); // Obtiene todas las mascotas
        List<MascoDuenioDTO> listaMascoDuenio = new ArrayList<MascoDuenioDTO>(); // Lista para almacenar los DTO
        MascoDuenioDTO masco_duenio = new MascoDuenioDTO();
        // Recorre todas las mascotas y arma el DTO con los datos de la mascota y su dueño
        for (Mascota masco : listaMascotas) {
            System.out.println(masco.getNombre());
            masco_duenio.setNombre_duenio(masco.getDuenio().getNombre());
            masco_duenio.setNombre_mascota(masco.getNombre());
            masco_duenio.setApellido_duenio(masco.getDuenio().getApellido());
            masco_duenio.setEspecie(masco.getEspecie());
            masco_duenio.setRaza(masco.getRaza());
            listaMascoDuenio.add(masco_duenio);
            masco_duenio = new MascoDuenioDTO(); // Resetea el DTO para la próxima iteración
        }
        return listaMascoDuenio;
    }
    
}

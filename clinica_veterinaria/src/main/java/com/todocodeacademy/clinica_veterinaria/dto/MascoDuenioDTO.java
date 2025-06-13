package com.todocodeacademy.clinica_veterinaria.dto;

import lombok.Getter;
import lombok.Setter;

// DTO (Objeto de Transferencia de Datos) para representar información combinada de mascota y dueño
@Getter @Setter // Anotaciones de Lombok para generar automáticamente los métodos getter y setter
public class MascoDuenioDTO {
    
    private String nombre_mascota; // Nombre de la mascota
    private String especie;        // Especie de la mascota (ej: perro, gato)
    private String raza;           // Raza de la mascota
    private String nombre_duenio;  // Nombre del dueño de la mascota
    private String apellido_duenio; // Apellido del dueño de la mascota

    public MascoDuenioDTO() {
    }

    // Constructor que inicializa todos los campos del DTO
    public MascoDuenioDTO(String nombre_mascota, String especie, String raza, String nombre_duenio, String apellido_duenio) {
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.nombre_duenio = nombre_duenio;
        this.apellido_duenio = apellido_duenio;
    }
    
    
    
}

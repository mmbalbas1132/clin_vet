package com.todocodeacademy.clinica_veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

// Modelo JPA que representa una mascota en la base de datos
@Getter @Setter // Lombok genera automáticamente los métodos getter y setter
@Entity // Indica que esta clase es una entidad JPA
public class Mascota {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE) // El ID se genera automáticamente con una secuencia
    private Long id; // Identificador único de la mascota
    private String nombre; // Nombre de la mascota
    private String especie; // Especie de la mascota (ej: perro, gato)
    private String raza; // Raza de la mascota
    private String color; // Color de la mascota

    @OneToOne
    @JoinColumn (name="id_duenio", referencedColumnName = "id_duenio") // Relación uno a uno con el dueño, usando la columna id_duenio
    private Duenio duenio; // Dueño de la mascota

    public Mascota() {
    }

    // Constructor con los campos principales (sin dueño)
    public Mascota(Long id, String nombre, String especie, String raza, String color) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
    }
    
    

}

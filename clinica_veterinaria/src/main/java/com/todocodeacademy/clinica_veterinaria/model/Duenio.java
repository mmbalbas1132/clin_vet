package com.todocodeacademy.clinica_veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

// Modelo JPA que representa a un dueño en la base de datos
@Getter @Setter // Lombok genera automáticamente los métodos getter y setter
@Entity // Indica que esta clase es una entidad JPA
public class Duenio {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE) // El ID se genera automáticamente con una secuencia
    private Long id_duenio; // Identificador único del dueño
    private String dni;     // DNI del dueño
    private String nombre;  // Nombre del dueño
    private String apellido; // Apellido del dueño
    private String celular; // Número de celular del dueño

    public Duenio() {
    }

    // Constructor con todos los campos
    public Duenio(Long id_duenio, String dni, String nombre, String apellido, String celular) {
        this.id_duenio = id_duenio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
    
    
    
}

package com.todocodeacademy.clinica_veterinaria.controller;
import com.todocodeacademy.clinica_veterinaria.model.Duenio;
import com.todocodeacademy.clinica_veterinaria.service.IDuenioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Controlador REST para gestionar dueños en la clínica veterinaria
@RestController
public class DuenioController {
    
    @Autowired
    private IDuenioService duenioServ; // Inyección del servicio que maneja la lógica de negocio de los dueños

    @GetMapping ("/duenio/traer") // Endpoint para obtener la lista de todos los dueños
    public List<Duenio> getPersonas() {
        return duenioServ.getDuenios(); // Llama al servicio para obtener los dueños
    }
    
    @PostMapping ("/duenio/crear") // Endpoint para crear un nuevo dueño
    public String savePersona (@RequestBody Duenio duenio) {
        duenioServ.saveDuenio(duenio); // Guarda el dueño recibido en el cuerpo de la petición
        return "La persona fue creada correctamente"; // Mensaje de confirmación
    }
    
    @DeleteMapping ("/duenio/borrar/{id}") // Endpoint para eliminar un dueño por su ID
    public String deletePersona(@PathVariable Long id) {
        duenioServ.deleteDuenio(id); // Elimina el dueño con el ID proporcionado
        return "La persona fue eliminada correctamente"; // Mensaje de confirmación
    }
    
    @PutMapping ("/duenio/editar") // Endpoint para editar un dueño existente
    public Duenio editPersona(@RequestBody Duenio duenio) {
        duenioServ.editDuenio(duenio); // Actualiza el dueño con los datos recibidos
        return duenioServ.findDuenio(duenio.getId_duenio()); // Devuelve el dueño actualizado
    }
    
}

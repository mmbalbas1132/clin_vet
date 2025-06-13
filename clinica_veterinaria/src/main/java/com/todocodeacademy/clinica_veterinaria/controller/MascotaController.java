package com.todocodeacademy.clinica_veterinaria.controller;
import com.todocodeacademy.clinica_veterinaria.dto.MascoDuenioDTO;
import com.todocodeacademy.clinica_veterinaria.model.Mascota;
import com.todocodeacademy.clinica_veterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Controlador REST para gestionar mascotas en la clínica veterinaria
@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascoServ; // Inyección del servicio que maneja la lógica de negocio de las mascotas

    @GetMapping("/mascotas/traer") // Endpoint para obtener la lista de todas las mascotas
    public List<Mascota> traerMascotas() {
        return mascoServ.getMascotas(); // Llama al servicio para obtener las mascotas
    }

    @PostMapping("/mascotas/crear") // Endpoint para crear una nueva mascota
    public String savePersona(@RequestBody Mascota masco) {
        mascoServ.saveMascota(masco); // Guarda la mascota recibida en el cuerpo de la petición

        return "La mascota fue creada correctamente"; // Mensaje de confirmación
    }

    @DeleteMapping("/mascotas/borrar/{id_mascota}") // Endpoint para eliminar una mascota por su ID
    public String deleteMascota(@PathVariable Long id_mascota) {
        mascoServ.deleteMascota(id_mascota); // Elimina la mascota con el ID proporcionado
        return "La mascota fue borrada correctamente"; // Mensaje de confirmación
    }
    
    @PutMapping("/mascotas/editar") // Endpoint para editar una mascota existente
    public String editMascota(@RequestBody Mascota masco) {
        
        mascoServ.editMascota(masco); // Actualiza la mascota con los datos recibidos
        return "La mascota fue borrada correctamente"; // Mensaje de confirmación (debería decir 'editada')
    }
    
    @GetMapping("/mascotas/traer-caniches") // Endpoint para obtener la lista de mascotas de raza caniche
    public List<Mascota> traerCaniches() {
        return mascoServ.getCaniches(); // Llama al servicio para obtener solo los caniches
    }
    
    @GetMapping ("mascotas/traer-duenios") // Endpoint para obtener la lista de dueños de mascotas
    public List<MascoDuenioDTO> traerMascoDuenios () {
        
        return mascoServ.getMascoDuenios(); // Llama al servicio para obtener los dueños de las mascotas

    }

}

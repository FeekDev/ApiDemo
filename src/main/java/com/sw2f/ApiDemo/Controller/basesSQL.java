// Esta capa sirve para mandarle al protocolo http las respuestas a las peticiones, tambien envia el codigo de estado, lo envia en json
package com.sw2f.ApiDemo.Controller;
import com.sw2f.ApiDemo.Models.Bases;
import com.sw2f.ApiDemo.Services.BasesServices;

//Librerias Api Rest
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

//tipo de api --> REST
@RestController

// Uri del controlador
@RequestMapping("/api/sql")
public class basesSQL {

    // Crear una instancia de la clase servicios
    @Autowired
    BasesServices _basesServices;

    // Decorador
    @GetMapping("/listar")
    public ArrayList<Bases> listarSQL() {
        ArrayList<Bases> listado = _basesServices.listar();

        return listado;
    }
}

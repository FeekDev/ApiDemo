// Esta capa sirve para mandarle al protocolo http las respuestas a las peticiones, tambien envia el codigo de estado, lo envia en json(parte externa)
package com.sw2f.ApiDemo.Controller;
import com.sw2f.ApiDemo.Models.Bases;
import com.sw2f.ApiDemo.Services.BasesServices;

//Librerias Api Rest
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


//tipo de api --> REST
@RestController

// Uri del controlador
@RequestMapping("/api")
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

    @PostMapping("/crear")
    public Bases Crear(@RequestBody Bases base) {
        Bases rs = _basesServices.guardar(base);
        return rs;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Bases> eliminar(@PathVariable int id) {
        boolean ok = _basesServices.eliminar(id);
        return (ok) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}

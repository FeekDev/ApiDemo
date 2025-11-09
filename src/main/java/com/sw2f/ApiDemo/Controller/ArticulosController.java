package com.sw2f.ApiDemo.Controller;

import java.util.ArrayList;
import com.sw2f.ApiDemo.Models.Articulos;
import com.sw2f.ApiDemo.Services.ArticulosServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class ArticulosController {

    @Autowired
    ArticulosServices _servicioArticulos;

    @GetMapping("/listarArticulos")
    public ArrayList<Articulos> obtenerArticulos() {
        ArrayList<Articulos> listaArticulos = _servicioArticulos.obtenerArticulos();
        return listaArticulos;
    }

    @PostMapping("/CrU")
    public Articulos Crear(@RequestBody Articulos articulo) {
        Articulos rs = _servicioArticulos.guardar(articulo);
        return rs;
    }

    @PutMapping("/CUp")
    public Articulos Actualizar(@RequestBody Articulos articulo) {
        Articulos rs = _servicioArticulos.guardar(articulo);
        return rs;
    }

    @DeleteMapping("eliminar/{id}")
    public Class<? extends BodyBuilder> eliminar(@PathVariable int id) {
        boolean ok = _servicioArticulos.eliminar(id);
        return (ok) ? ResponseEntity.ok().getClass() : (Class<? extends BodyBuilder>) ResponseEntity.notFound().getClass();
    }

}

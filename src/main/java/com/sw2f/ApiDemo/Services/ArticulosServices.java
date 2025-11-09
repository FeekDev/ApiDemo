package com.sw2f.ApiDemo.Services;
import com.sw2f.ApiDemo.Models.Articulos;
import com.sw2f.ApiDemo.Repositorio.ArticulosRepositorio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticulosServices {

    @Autowired
    ArticulosRepositorio _repoArticulos;

    public ArrayList<Articulos> obtenerArticulos() {
        return (ArrayList<Articulos>) _repoArticulos.findAll();
    }

    public Articulos guardar(Articulos articulo) {
        return _repoArticulos.save(articulo);
    }

    public boolean eliminar(int id) {
        try {
            _repoArticulos.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}

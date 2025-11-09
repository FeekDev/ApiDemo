package com.sw2f.ApiDemo.Services;
import com.sw2f.ApiDemo.Models.Articulo;
import com.sw2f.ApiDemo.Repositorio.ArticulosRepositorio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticulosServices {

    @Autowired
    ArticulosRepositorio _repoArticulos;

    public ArrayList<Articulo> obtenerArticulos() {
        return (ArrayList<Articulo>) _repoArticulos.findAll();
    }

    public Articulo guardar(Articulo articulo) {
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

// realiza las validaciones en caso de tener condiciones y devuelve los datos a la capa controlador (reglas de negocio)
package com.sw2f.ApiDemo.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw2f.ApiDemo.Models.Bases;
import com.sw2f.ApiDemo.Repositorio.BasesRepositorio;

@Service
public class BasesServices {

    @Autowired // Singleton
    BasesRepositorio _repo;

    public ArrayList<Bases> listar() { // Metodo publico porque lo utiliza el controller
        return (ArrayList<Bases>)_repo.findAll(); // Retorna todo lo que hay en la tabla
        /*ArrayList<Bases> listado = new ArrayList<>();
        Bases a = new Bases();
        
        a.setId(1);
        a.setNombreComercial("SQL SERVER");
        a.setVersion(2019);

        listado.add(a);

        return listado;*/
    }

    public Bases guardar(Bases base) {
        return _repo.save(base);
    }

    public boolean eliminar(int id) {
        try {
            _repo.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}

// realiza las validaciones en caso de tener condiciones y devuelve los datos a la capa controlador (reglas de negocio)
package com.sw2f.ApiDemo.Services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sw2f.ApiDemo.Models.Bases;

@Service
public class BasesServices {
    public ArrayList<Bases> listar() {
        ArrayList<Bases> listado = new ArrayList<>();
        Bases a = new Bases();
        
        a.setId(1);
        a.setNombreComercial("SQL SERVER");
        a.setVersion(2019);

        listado.add(a);

        return listado;
    }
}

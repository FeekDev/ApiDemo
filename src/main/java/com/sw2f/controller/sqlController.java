package com.sw2f.controller;

//Librerias Api Rest
import org.springframework.web.bind.annotation.RestController;

//tipo de api --> REST
@RestController

//Uri del controlador
@RequestMapping("/api/sql")
public class sqlController {
    
    //Decorador
    @GetMapping("/listar")
    public ArrayList<String> listarSQL(){
        ArrayList<String> listado = new ArrayList<String>();
        listado.add("SQL Server 2019");
        listado.add("SQL Server 2022");

        return listado;
    }
}

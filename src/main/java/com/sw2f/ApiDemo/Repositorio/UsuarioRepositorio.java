package com.sw2f.ApiDemo.Repositorio;
import com.sw2f.ApiDemo.Models.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends CrudRepository <Usuario, Integer> {

}

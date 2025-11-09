package com.sw2f.ApiDemo.Repositorio;
import com.sw2f.ApiDemo.Models.Articulo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticulosRepositorio extends CrudRepository<Articulo, Integer> {
}

package com.sw2f.ApiDemo.Repositorio;
import com.sw2f.ApiDemo.Models.Articulos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticulosRepositorio extends CrudRepository<Articulos, Integer> {
}

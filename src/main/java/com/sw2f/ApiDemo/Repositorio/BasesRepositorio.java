package com.sw2f.ApiDemo.Repositorio;
import com.sw2f.ApiDemo.Models.Bases;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
// Accede a la base de datos
public interface BasesRepositorio extends CrudRepository<Bases, Integer> {

}

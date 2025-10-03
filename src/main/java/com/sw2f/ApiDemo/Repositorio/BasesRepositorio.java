package com.sw2f.ApiDemo.Repositorio;
import com.sw2f.ApiDemo.Models.Bases;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface BasesRepositorio extends CrudRepository<Bases, Integer> {

}

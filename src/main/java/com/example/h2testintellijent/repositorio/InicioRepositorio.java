package com.example.h2testintellijent.repositorio;

import com.example.h2testintellijent.modelo.Producto;
import org.springframework.data.repository.CrudRepository;

public interface InicioRepositorio extends CrudRepository<Producto, Long> {

}

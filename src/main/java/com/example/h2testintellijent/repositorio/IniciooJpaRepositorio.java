package com.example.h2testintellijent.repositorio;

import com.example.h2testintellijent.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IniciooJpaRepositorio extends JpaRepository<Producto,Long>{}

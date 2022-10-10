package com.example.h2testintellijent.servicio;

import com.example.h2testintellijent.modelo.Producto;
import com.example.h2testintellijent.repositorio.InicioRepositorio;
import com.example.h2testintellijent.repositorio.IniciooJpaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class InicioSericio {

 @Autowired
 private InicioRepositorio repositorio;
 @Autowired
 private IniciooJpaRepositorio repositorioJpa;

 public List<Producto> getProducts(){
     List<Producto> listProdutos = (List<Producto>) repositorio.findAll();
     List<Producto> listProdutosJpa = (List<Producto>) repositorioJpa.findAll();

     if("Funciona todos".indexOf("Funciona todos") >= 0){
         System.out.println("Si ingreso - " + "Funciona".indexOf("Funciona"));
     }
     System.out.println("this is getProducts");
     List lprod = new ArrayList<Producto>();
     for (Producto p:listProdutos) {
         System.out.println(p.getNombre() + " - CrudRepository");
         lprod.add(p);
     }
     for (Producto p:listProdutosJpa) {
         System.out.println(p.getNombre() + " - JpaRepository");
         lprod.add(p);
     }
     //return listProdutos;
     return lprod;
 }

 public Producto getProduct(Long ID){
    Producto product = repositorio.findById(ID).get();
     if("Funciona uno".indexOf("Funciona uno") >= 0){
         System.out.println("Si ingreso - " + "Funciona".indexOf("Funciona"));
     }
    return product;

 }

}

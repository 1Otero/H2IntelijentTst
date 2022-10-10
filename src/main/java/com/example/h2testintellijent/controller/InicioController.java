package com.example.h2testintellijent.controller;

import com.example.h2testintellijent.modelo.Producto;
import com.example.h2testintellijent.servicio.InicioSericio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tst")
public class InicioController {

    @Autowired
    InicioSericio iniServicio;

    public InicioController(){
        System.out.println("InicioController paso! ");
    }

    @GetMapping("/")
    public String getIni(){
        return "Inicio el usuario!!! ";
    }

    @GetMapping("/get/{id}")
    public Producto getProduct(@RequestParam(value = "id", defaultValue = "1") Long id){
        Producto product = iniServicio.getProduct(id);
        System.out.println("Get one data! ");
       return product;
    }
    @GetMapping("/get/")
    public List<Producto> getProduct(){
        List<Producto> listProduct = iniServicio.getProducts();
        System.out.println("Get all data! ");
        return listProduct;
    }
    @PostMapping("/add/")
    public Producto AddProduct(@RequestBody Producto product){
        System.out.println("adding product... ");
        if("dato".indexOf("dato") > 0){
            System.out.println("Entro add indexOf");
        }else{
            System.out.println("no entro add indexOf");
        }
        Producto newProduct = new Producto();
        return newProduct;
    }
}

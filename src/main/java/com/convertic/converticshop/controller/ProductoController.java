package com.convertic.converticshop.controller;

import com.convertic.converticshop.model.Producto;
import com.convertic.converticshop.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping ("/all")
    public List<Producto> findAll(){
        return productoService.findAll();
    }

    /*@GetMapping ("/{referencia}")
    public Producto findByReferencia(@PathVariable(name = "referencia") String referencia){
        return productoService.findByReferencia(referencia).orElse(null);
    }*/

    @GetMapping ("/{genero}/{caracteristica}")
    public ResponseEntity<List<Producto>> findByGeneroAndCaracteristica(@PathVariable(name = "genero")  String genero,
                                                                        @PathVariable (name = "caracteristica") String caracteristica){
        List<Producto> productoList;

        productoList = productoService.findByGeneroAndCaracteristica(genero, caracteristica);
        return new ResponseEntity<>(productoList, HttpStatus.OK);
    }

    @GetMapping ("/{caracteristica}")
    public ResponseEntity<List<Producto>> findByCaracteristica(@PathVariable (name = "caracteristica") String caracteristica){
        List<Producto> productoList;

        productoList = productoService.findByCaracteristica(caracteristica);
        return new ResponseEntity<>(productoList, HttpStatus.OK);
    }

}

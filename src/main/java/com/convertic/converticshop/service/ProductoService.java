package com.convertic.converticshop.service;

import com.convertic.converticshop.model.Producto;
import com.convertic.converticshop.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findAll(){
        return productoRepository.findAll();
    }

    public Optional<Producto> findByReferencia(String referencia){
        return productoRepository.findByReferencia(referencia);
    }


    public List<Producto> findByGeneroAndCaracteristica(String genero, String caracteristica){

        List<Producto> listaProducto;
        List<Producto> listaProducto1= productoRepository.findByGenero_GeneroContainingIgnoreCaseAndCategoria_CategoriaContainingIgnoreCase(genero, caracteristica);
        List<Producto> listaProducto2= productoRepository.findByGenero_GeneroContainingIgnoreCaseAndColor_ColorContainingIgnoreCase(genero, caracteristica);
        List<Producto> listaProducto3= productoRepository.findByGenero_GeneroContainingIgnoreCaseAndMarca_MarcaContainingIgnoreCase(genero, caracteristica);

        if (!listaProducto1.isEmpty()){
            listaProducto=listaProducto1;
        } else if (!listaProducto2.isEmpty()) {
            listaProducto=listaProducto2;
        }else {
            listaProducto=listaProducto3;
        }
        return listaProducto;
    }

    public List<Producto> findByCaracteristica(String caracteristica){

        List<Producto> listaProducto;
        List<Producto> listaProducto1= productoRepository.findByCategoria_CategoriaContainingIgnoreCase(caracteristica);
        List<Producto> listaProducto2= productoRepository.findByColor_ColorContainingIgnoreCase(caracteristica);
        List<Producto> listaProducto3= productoRepository.findByMarca_MarcaContainingIgnoreCase(caracteristica);

        if (!listaProducto1.isEmpty()){
            listaProducto=listaProducto1;
        } else if (!listaProducto2.isEmpty()) {
            listaProducto=listaProducto2;
        }else {
            listaProducto=listaProducto3;
        }
        return listaProducto;
    }

}

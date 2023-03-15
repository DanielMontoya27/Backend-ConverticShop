package com.convertic.converticshop.repository;

import com.convertic.converticshop.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

 public List<Producto> findByGenero_GeneroContainingIgnoreCaseAndCategoria_CategoriaContainingIgnoreCase(String genero, String categoria);
 public List<Producto> findByGenero_GeneroContainingIgnoreCaseAndColor_ColorContainingIgnoreCase(String genero, String color);
 public List<Producto> findByGenero_GeneroContainingIgnoreCaseAndMarca_MarcaContainingIgnoreCase(String genero, String marca);
 public Optional<Producto> findByReferencia(String referencia);

 public List<Producto> findByCategoria_CategoriaContainingIgnoreCase(String categoria);
 public List<Producto> findByColor_ColorContainingIgnoreCase(String color);
 public List<Producto> findByMarca_MarcaContainingIgnoreCase(String marca);
}

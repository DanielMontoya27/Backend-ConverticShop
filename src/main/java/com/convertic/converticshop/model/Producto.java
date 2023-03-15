package com.convertic.converticshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;
    private String referencia;
    @Column(name = "id_genero")
    private Integer idGenero;
    @Column(name = "id_categoria")
    private Integer idCategoria;
    @Column(name = "id_marca")
    private Integer idMarca;
    @Column(name = "id_color")
    private Integer idColor;
    @Column(name = "id_talla")
    private Integer idTalla;
    private String descripcion;
    @Column(name = "valor_unitario")
    private Integer valorUnitario;
    private Integer Stock;
    private String imagen;
    @Column(name = "mas_buscados")
    private Integer masBuscados;

    @ManyToOne
    @JoinColumn(name = "id_genero", updatable = false, insertable = false)
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "id_categoria", updatable = false, insertable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_marca", updatable = false, insertable = false)
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "id_color", updatable = false, insertable = false)
    private Color color;

    @ManyToOne
    @JoinColumn(name = "id_talla", updatable = false, insertable = false)
    private Talla talla;

}
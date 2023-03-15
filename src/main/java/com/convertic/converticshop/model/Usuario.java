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
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Column(name = "numero_documento")
    private String numeroDocumento;
    @Column(name = "id_tipo_documento")
    private Integer idTipoDocumento;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_tipo_documento", updatable = false, insertable = false)
    private TipoDocumento tipo_documento;

}
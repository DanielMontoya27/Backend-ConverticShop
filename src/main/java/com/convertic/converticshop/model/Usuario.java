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
@Table(name="Usuario")


public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    private Integer idTipoDocumento;

    private String numeroDocumento;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;

    @Override
    public String toString() {
        return "Usuario [idUsuario=" + idUsuario + ", TipoDocumento=" + idTipoDocumento + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email + ", password=" + password + "]";
    }

}
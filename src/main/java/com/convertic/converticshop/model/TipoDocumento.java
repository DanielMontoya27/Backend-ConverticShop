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
@Table(name="tipo_documento")

public class TipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoDocumento;
    private String tipoDocumento;

    @Override
    public String toString() {
        return "TipoDocumento [idTipoDocumento=" + idTipoDocumento + ", TipoDocumento=" + tipoDocumento + "]";
    }
}
package com.convertic.converticshop.controller;

import com.convertic.converticshop.model.TipoDocumento;
import com.convertic.converticshop.service.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipodocumento")
public class TipoDocumentoController {

    @Autowired
    private TipoDocumentoService tipoDocumentoService;

    @GetMapping("/all")
    public List<TipoDocumento> findAll() {
        return tipoDocumentoService.findAll();
    }
}

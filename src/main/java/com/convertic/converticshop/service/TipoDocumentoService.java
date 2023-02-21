package com.convertic.converticshop.service;

import com.convertic.converticshop.model.TipoDocumento;
import com.convertic.converticshop.repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoService {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    public List<TipoDocumento> findAll (){
        return tipoDocumentoRepository.findAll();
    }

    public TipoDocumento save (TipoDocumento tipoDocumento){
        return  tipoDocumentoRepository.save(tipoDocumento);
    }
}

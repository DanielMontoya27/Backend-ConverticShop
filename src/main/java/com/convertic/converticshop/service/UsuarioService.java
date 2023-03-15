package com.convertic.converticshop.service;

import com.convertic.converticshop.model.Usuario;
import com.convertic.converticshop.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
    public Usuario findById(String idUsuario) {
        return usuarioRepository.findById(idUsuario).orElse(null);
    }

    public Boolean login(String email, String password) throws ExceptionUser{
        Usuario usuario = usuarioRepository.findByEmailAndPassword(email, password).orElseThrow(ExceptionUser:: new);
        return usuario !=null;
    }
    public Usuario save (Usuario usuario){

        return usuarioRepository.save(usuario);
    }
}
package com.convertic.converticshop.service;

import com.convertic.converticshop.model.Usuario;
import com.convertic.converticshop.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    /*public Usuario findByEmail(String email){
        return usuarioRepository.findByEmail(email)orElse(other: null);
        }*/


    public Boolean login(String email, String password) {
        Usuario usuario = usuarioRepository.findByEmailAndPassword(email, password);
        if(usuario != null) {
            return true;
        } else {
            return false;
        }
    }
    public Usuario save (Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
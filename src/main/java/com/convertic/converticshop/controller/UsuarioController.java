package com.convertic.converticshop.controller;

import com.convertic.converticshop.model.Usuario;
import com.convertic.converticshop.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController{

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/all")
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> login(@RequestBody Usuario usuario) {
        Boolean validacion = usuarioService.login(usuario.getEmail(), usuario.getPassword());
        if (validacion == true) {
            return new ResponseEntity<>(validacion, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(validacion, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/save")
    public Usuario save(@RequestBody Usuario usuario){return usuarioService.save(usuario);}

}
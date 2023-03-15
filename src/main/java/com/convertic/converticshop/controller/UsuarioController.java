package com.convertic.converticshop.controller;

import com.convertic.converticshop.model.Usuario;
import com.convertic.converticshop.service.ExceptionUser;
import com.convertic.converticshop.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
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
        try{
            boolean login = usuarioService.login(usuario.getEmail(), usuario.getPassword());
            return new ResponseEntity<>(login, HttpStatus.OK);
        }catch (ExceptionUser eu){
            return new ResponseEntity<>(false, HttpStatus.OK);
        }

    }
    @PostMapping("/save")
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);}

}
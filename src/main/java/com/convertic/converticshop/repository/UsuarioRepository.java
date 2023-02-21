package com.convertic.converticshop.repository;


import com.convertic.converticshop.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    public Optional<Usuario> findByEmail(String email);
    public Usuario findByEmailAndPassword(String email, String password);
}
package com.jkstylle.repository;

import com.jkstylle.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    boolean existsById(Long id);

    void deleteById(Long id);
}


package com.projeto.usuario.infrastructure.repository;

import com.projeto.usuario.infrastructure.entity.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);

    Optional<Usuario> findByEmail(String email); //evitar retorno de info nula - nullPointerException

    @Transactional
    void deleteByEmail(String email);

}

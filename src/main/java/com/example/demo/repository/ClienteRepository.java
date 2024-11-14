package com.example.demo.repository;

import com.example.demo.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // JpaRepository ya proporciona métodos como findById(), save(), deleteById(), etc.

    List<Cliente> findByNombre(String nombre);  // Busca clientes por nombre

    Optional<Cliente> findByEmail(String email);  // Busca cliente por email

    List<Cliente> findByNombreContaining(String term);  // Busca clientes por nombre que contengan un término
}

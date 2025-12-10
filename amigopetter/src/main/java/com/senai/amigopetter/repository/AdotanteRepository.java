package com.senai.amigopetter.repository;

import org.springframework.stereotype.Repository;

import com.senai.amigopetter.models.Adotante;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AdotanteRepository extends JpaRepository<Adotante, Long>{

    Optional<Adotante> findById(Long id);

}

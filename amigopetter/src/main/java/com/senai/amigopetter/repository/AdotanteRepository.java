package com.senai.amigopetter.repository;

import org.springframework.stereotype.Repository;

import com.senai.amigopetter.models.Adotante;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public class AdotanteRepository extends JpaRepository<Adotante,Long>{

}

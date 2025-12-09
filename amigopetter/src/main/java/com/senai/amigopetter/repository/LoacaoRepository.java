package com.senai.amigopetter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senai.amigopetter.models.Doadores;

@Repository
public interface LoacaoRepository extends JpaRepository<Doadores,Long>{

}

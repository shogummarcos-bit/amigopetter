package com.senai.amigopetter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.amigopetter.models.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Long>{

}

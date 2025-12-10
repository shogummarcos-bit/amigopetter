package com.senai.amigopetter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.amigopetter.models.Adotante;
import com.senai.amigopetter.repository.AdotanteRepository;

@Service
public class AdotanteServices {
@Autowired
private AdotanteRepository adotanteRepository;
public Adotante salvarAdotante(Adotante adotante){
    return adotanteRepository.save(adotante);
}
public List<Long> listarTodos(){
    return adotanteRepository.findAll();
}
public Optional<Adotante> buscarPorId(Long id){
    return adotanteRepository.findById(id);
}
}

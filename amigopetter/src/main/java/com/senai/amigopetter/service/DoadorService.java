package com.senai.amigopetter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.amigopetter.models.Pets;
import com.senai.amigopetter.repository.PetsRepository;

@Service
public class DoadorService {
@Autowired

private PetsRepository petRepository;
public Pets cadastrarPet(Pets pet){
    return petRepository.save(pet);
}
public List<Pets> listarPet(){
    return petRepository.findAll();
}
public Optional<Pets> BuscorPetPorID(Long id){
    return petRepository.findById(id);
}
public void removerPet(Long id){
    petRepository.deleteById(id);

}
}

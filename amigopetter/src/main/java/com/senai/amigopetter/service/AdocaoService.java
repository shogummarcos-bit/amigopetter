package com.senai.amigopetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senai.amigopetter.repository.*;

import com.senai.amigopetter.models.Adocao;
import com.senai.amigopetter.models.Pets;

@Service
public class AdocaoService {
@Autowired
private AdocaoRepository adocaoRepository;
@Autowired private PetsServices petsServices;
public adocao criaradocao(Adocao adocao){
    Adocao novaAdocao=adocaoRepository.save(adocao);
    Pets pet=adocao.getPet();
    return novaAdocao;
}
public List<Adocao>listartodasAdocoes(){
    return adocaoRepository.findAll();
}
public adocao buscarAdocaoId(Long id){
    return adocaoRepository.findById(id);
}
public void removrAdocao(Long id){
    adocaoRepository.deleteById(id);
    
}
public List<Adocao> listartodasAdocao() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listartodasAdocao'");
}
public Adocao criarAdocao(Adocao adocao) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'criarAdocao'");
}
public Adocao buscarAdocaoPorId(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'buscarAdocaoPorId'");
}
public void removerAdocao(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removerAdocao'");
}
   

}

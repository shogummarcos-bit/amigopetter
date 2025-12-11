package com.senai.amigopetter.service;

import com.senai.amigopetter.models.Adocao;

#Service
public class AdocaoService {
@Autowired
pricate AdocaoRepositorio adocaoRepository;
@Autowiredpriate PetsServices petsServices;
public adocao criaradocao(Adocao adocao){
    Aocao novaAdocao=adocaoRepository.save(adocao);
    Pt pet=adocao.getPet();
    return novaAdocao;
}
public Lis<Adocao>listartodasAdocoes(){
    return adocaoRepository.findAll();
}
public adocao buscarAdocaoId(Long id){
    return adocaoRepository.findById(id);
}
public void rmovrAdocao(Longid){
    adocaoRepository.deleteById(id);
    
}
   

}

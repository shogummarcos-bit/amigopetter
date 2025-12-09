package com.senai.amigopetter.service;

@Service
public class AdotantesServices {
@Autowired
private AdotanteRepository adotanteRepository;
public Adotante salvarAdotante(Adotante adotante){
    return adotanteRepository.save(adotante);
}
public List<Adotante> listarTodos(){
    return adotanteRepository.findAll();
}
public Optional<Adotante> buscarPorId(Long id){
    return adotanteRepository.findById(id);
}
}

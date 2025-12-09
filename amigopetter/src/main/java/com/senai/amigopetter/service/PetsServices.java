package com.senai.amigopetter.service;

@Service
public class PetsServices {
@Autowired
private PetsRepository petRepository;
public Pets adicionarPets(Pets pet){
    return petRepository.save(pet);

}
public List<Pets> listarTodos(){
    return petRepository.findAll();
}
public Optional<Pets> buscarPorId(Long id){
    return petRepository.findById(id);
}
public List<Pets> listarDisponivel(){
    return petRepository.finByDisponivelTrue();
}
}

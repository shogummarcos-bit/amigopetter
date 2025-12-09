package com.senai.amigopetter.controller;

@RestController
@RequestMapping("/api/pets")
public class PetsController {
@Autowired PetsServices petService;
@PostMapping
public ResponseEntity<Pets> cadastrarPets(@RequestBody Pets pet){
    Pets novoPet=petService.adicionarPets(pet);
    return ResponseEntity.ok(novoPet);
}
@GetMapping
public ResponseEntity<List<Pets>> listarPets(){
    List<Pets> pets=petService.listarTodos();
    return ResponseEntity.ok(pets);
}
@GetMapping("/disponiveis")
public ResponseEntity<List<Pets>> listarDispoonivel(){
    List<Pets> pet=petService.listarDisponivel();
    return ResponseEntity.ok(pet);
}
}

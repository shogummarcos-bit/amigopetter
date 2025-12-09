package com.senai.amigopetter.controller;


@RestController
@RequestMapping("/api/adotante")
public class AdotanteController {

    @Autowired
private AdotanteServices adotanteServices;
@PostMapping("path")
public ResponseEntity<Adotante> cadastrarAdotante(@RequestBody Adotante adotante) {
   Adotante novoAdotante=adotanteServices.salvarAdotante(adotante);
   return ResponseEntity.ok(novoAdotante);
}
@GetMapping
public ResponseEntity<List<Adotante>> listarAdotantes() {
    List<Adotante> adotantes=adotanteServices.listarTodos();
    return ResponseEntity.ok(adotantes);
}
@GetMapping("/{id}")
public ResponseEntity<Adotante> buscarAdotantePorId(@PathVariable Long id) {
    Optional<Adotante> adotante=adotanteServices.buscarPorId(id);
    return ResponseEntity.ok(adotante);
}


}

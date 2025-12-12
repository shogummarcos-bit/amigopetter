package com.senai.amigopetter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.senai.amigopetter.models.Adocao;
import com.senai.amigopetter.service.AdocaoService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("adocao")
public class AdocaoController {
@Autowired
private AdocaoService adocaoService;
@PostMapping
public ResponseEntity<Adocao> criarAdocao(@RequestBody Adocao adocao){
    Adocao novaAdocao=adocaoService.criarAdocao(adocao);
    return ResponseEntity.ok(novaAdocao);
}
@GetMapping
public List<Adocao> listartodasAdocao() {
    return adocaoService.listartodasAdocao();
}
@GetMapping("/{id}")
public ResponseEntity<Adocao> buscarAdocaoPorId(@PathVariable Long id){
    Adocao adocao=adocaoService.buscarAdocaoPorId(id);
    return ResponseEntity.ok(adocao);
}
@PutMapping("/{id}")
public  ResponseEntity<Adocao> atualizarAdocao(@PathVariable Long id, @RequestBody Adocao adocaoDetails) {
    Adocao adocaoAtualizada=adocaoService(id,adocaoDetails);
    return ResponseEntity.ok(adocaoAtualizada);
}
private Adocao adocaoService(Long id, Adocao adocaoDetails) {
    throw new UnsupportedOperationException("Unimplemented method 'adocaoService'");
}
@DeleteMapping("/ìd}")
public ResponseEntity<Void> removerAdocao(@PathVariable Long id){
    adocaoService.removerAdocao(id);
    return (ResponseEntity<Void>) ResponseEntity.ok();
}
@GetMapping("/{status}")
public List<Adocao> listaeAdocoaoPorStatos(@PathVariable statusAdocao status){
    return adocaoService.listaeAdocoaoPorStatos(status);
}

}


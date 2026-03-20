package com.example.projeto.controller;

import com.example.projeto.model.ProjetoModel;
import com.example.projeto.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public ProjetoModel criarProjeto(@RequestBody ProjetoModel projetoModel){
        return projetoService.criarProjeto(projetoModel);
    }

    @GetMapping
    public List<ProjetoModel> listarProjeto(){
        return projetoService.listarProjeto();
    }

    @GetMapping("/{id}")
    public Optional<ProjetoModel> buscarProjeto(@PathVariable Long id){
        return projetoService.buscarProjeto(id);
    }

    @DeleteMapping("/{id}")
    public void deletarProjeto(@PathVariable  Long id){
        projetoService.deletarProjeto(id);
    }
}
package com.example.projeto.service;

import com.example.projeto.model.ProjetoModel;
import com.example.projeto.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public ProjetoModel criarProjeto(ProjetoModel projetoModel){
        return projetoRepository.save(projetoModel);
    }

    public List<ProjetoModel> listarProjeto(){
        return projetoRepository.findAll();
    }

    public Optional<ProjetoModel> buscarProjeto(Long id){
        return projetoRepository.findById(id);
    }

    public void deletarProjeto(Long id){
        projetoRepository.deleteById(id);
    }
}

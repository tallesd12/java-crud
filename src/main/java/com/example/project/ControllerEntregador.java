package com.example.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.database.RepositorioEntregadores;
import com.example.project.models.Entregadores;


@RestController
@RequestMapping("/entregadores")
public class ControllerEntregador {
    @Autowired
    private RepositorioEntregadores repositorio;

    @GetMapping
    public List<Entregadores> listar(){
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar(@RequestBody Entregadores entregadores){
        repositorio.save(entregadores);
    }

    @PutMapping
    public void alterar(@RequestBody Entregadores entregadores){
        if(entregadores.getId() > 0)
            repositorio.save(entregadores);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repositorio.deleteById(id);
    }
}

    





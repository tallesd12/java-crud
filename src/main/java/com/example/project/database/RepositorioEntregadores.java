package com.example.project.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.models.Entregadores;

public interface RepositorioEntregadores extends JpaRepository<Entregadores,Long> {
    
}

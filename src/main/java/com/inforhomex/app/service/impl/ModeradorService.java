package com.inforhomex.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.inforhomex.app.model.Moderador;
import com.inforhomex.app.service.IGenerador;

import jakarta.inject.Singleton;

@Singleton
public class ModeradorService implements IGenerador<Moderador>{

    private List<Moderador> moderadores = new ArrayList<>();

    @Override
    public Moderador create(Moderador moderador){
        Moderador nuevo = moderador;
        this.moderadores.add(nuevo);
        return nuevo;
    }

    @Override
    public List<Moderador> getList(){
        return this.moderadores;
    }
}

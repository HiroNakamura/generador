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

    @Override
    public Moderador get(int id){
        return this.moderadores.stream().filter(moderador -> moderador.id == id)
        .findFirst().orElse(null);
    }

    @Override
    public void delete(int id){
        Moderador borrar = this.get(id);
        this.moderadores.remove(borrar);
    } 

    @Override
    public Moderador  update(Moderador moderador, int id){
        Moderador obtener = this.get(id);
        obtener.id = moderador.id;
        obtener.nombre = moderador.nombre;
        obtener.clave = moderador.clave;
        return obtener;
    }
}

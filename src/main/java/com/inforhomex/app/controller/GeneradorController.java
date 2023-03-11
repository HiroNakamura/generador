package com.inforhomex.app.controller;

import com.inforhomex.app.resource.GeneradorResource;
import com.inforhomex.app.service.Logger;

import io.micronaut.http.annotation.Controller;
import jakarta.inject.Inject;

@Controller
public class GeneradorController  implements GeneradorResource{

    @Inject
    private Logger myLogger;
    
    @Override
    public String getSaludo(){
        this.myLogger.log("Se ejecuta el metodo \"getSaludo()\"");
        return "¡Hola, mundo en Micronaut!";
    }
}

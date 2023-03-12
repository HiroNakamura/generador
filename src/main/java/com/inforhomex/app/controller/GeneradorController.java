package com.inforhomex.app.controller;

import com.inforhomex.app.model.Moderador;
import com.inforhomex.app.resource.GeneradorResource;
import com.inforhomex.app.service.Logger;
import com.inforhomex.app.service.impl.ModeradorService;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import jakarta.inject.Inject;
import java.util.List;

/**
 * Clase controller que tiene los métodos para acceder a los recursos.
 */
@Controller
public class GeneradorController  implements GeneradorResource{

    @Inject
    private Logger myLogger;

    @Inject
    private ModeradorService moderadorService;
    
    @Override
    public String getSaludo(){
        this.myLogger.log("Se ejecuta el metodo \"getSaludo()\"");
        return "¡Hola, mundo en Micronaut!";
    }

    @Override
    public HttpResponse<Moderador> crearModerador(@Body Moderador moderador){
        this.myLogger.log("Generado: "+moderador);
        this.myLogger.log("Se ejecuta metodo \"crearModerador\"");
        return HttpResponse.created(this.moderadorService.create(moderador));
    }

    @Override
    public HttpResponse<List<Moderador>> listaModeradores(){
        this.myLogger.log("Se ejecuta metodo \"listaModeradores\"");
        return HttpResponse.ok(this.moderadorService.getList());
    }
}

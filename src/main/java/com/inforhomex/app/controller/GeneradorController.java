package com.inforhomex.app.controller;

import com.inforhomex.app.model.Moderador;
import com.inforhomex.app.resource.GeneradorResource;
import com.inforhomex.app.service.Logger;
import com.inforhomex.app.service.impl.ModeradorService;

import io.micronaut.http.annotation.Body;
import io.micronaut.context.annotation.Value;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.PathVariable;
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

    @Value("${micronaut.application.name}")
    private String nombreAplicacion;
    
    @Override
    public String getSaludo(){
        this.myLogger.log("Se ejecuta el metodo \"getSaludo\"");
        return "¡Hola, mundo en Micronaut, nombre de la aplicación: ".concat(nombreAplicacion);
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

    @Override
    public HttpResponse<Moderador> obtenerModerador(@PathVariable int id){
        this.myLogger.log("Se ejecuta metodo \"obtenerModerador\"");
        return HttpResponse.ok(this.moderadorService.get(id));
    }

    @Override
    public void eliminarModerador(@PathVariable int id){
        this.myLogger.log("Se ejecuta metodo \"eliminarModerador\"");
        this.moderadorService.delete(id);
    }

    @Override
    public HttpResponse<Moderador> actualizarModerador(@PathVariable int id, @Body Moderador moderador){
        this.myLogger.log("Se ejecuta metodo \"actualizarModerador\"");
        return HttpResponse.created(this.moderadorService.update(moderador, id));
    }
}

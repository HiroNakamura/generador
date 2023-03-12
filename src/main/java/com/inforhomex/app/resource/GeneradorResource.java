package com.inforhomex.app.resource;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;

import java.util.List;

import com.inforhomex.app.model.Moderador;

/**
 * Interface que define los métodos del controller.
 */
public interface GeneradorResource {

    /**
     * Método para saludar.
     * 
     * @return Devuelve un saludo.
     */
    @Get(value="/v1/saludar",produces = MediaType.APPLICATION_JSON)
    public String getSaludo();
    /**
     * Método para crear un Moderador.
     * @param moderador 
     *        Nuevo Moderador a crear.
     * @return
     *       Nuevo Moderador creado.
     */
    @Post("/v1/moderador")//value="/v1/moderador",produces = MediaType.APPLICATION_JSON,consumes = MediaType.APPLICATION_JSON)
    public HttpResponse<Moderador> crearModerador(@Body Moderador moderador);
    /**
     * Método que devuleve una lista de Moderadores.
     * 
     * @return {@link List<Moderador>}
     */
    @Get("/v1/moderadores")//value="/v1/moderadores",produces = MediaType.APPLICATION_JSON,consumes = MediaType.APPLICATION_JSON)
    public HttpResponse<List<Moderador>> listaModeradores();
    
}

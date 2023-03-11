package com.inforhomex.app.resource;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.MediaType;


public interface GeneradorResource {

    /**
     * Método para saludar.
     * 
     * @return Devuelve un saludo.
     */
    
    @Get(value="/saludar",produces = MediaType.APPLICATION_JSON)
    public String getSaludo();

}

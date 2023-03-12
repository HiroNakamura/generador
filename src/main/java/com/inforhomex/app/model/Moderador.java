package com.inforhomex.app.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Clase que define los datos del Moderador.
 */
@Data
@NoArgsConstructor
@ToString
@JsonPropertyOrder({ "id", "nombre","clave" })
public class Moderador implements Serializable{
    /**
     * ID serial.
     */
    private static final long serialVersionUID = 1L;
    /**
     * Id del Moderador.
     */
    public int id;
    /**
     * Nombre del Moderador.
     */
    public String nombre;
    /**
     * Clave de acceso del Moderador. 
     */
    public String clave;
}

package com.inforhomex.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Clase que define los datos del Moderador.
 */
@Data
@NoArgsConstructor
@ToString
public class Moderador {
    /**
     * Id del Moderador.
     */
    private int id;
    /**
     * Nombre del Moderador.
     */
    private String nombre;
    /**
     * Clave de acceso del Moderador. 
     */
    private String clave;
}

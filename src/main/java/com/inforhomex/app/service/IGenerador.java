package com.inforhomex.app.service;

import java.util.List;

/**
 * Interface genérica que tiene los métodos de acceso, creación y eliminación (CRUD).
 */
public interface IGenerador<T> {
    /**
     * Método genérico para crear objeto.
     * @param t
     *      Tipo a crear.
     * @return {@link T}.
     */
    T create(T t);
    /**
     * Método genérico para obtener una lista de objetos creados.
     * @return {@link List<T>}.
     */
    List<T> getList();
    /**
     * Método para recuperar un objeto creado mediante su id.
     * @param id
     *      Id del objeto creado.
     * @return {@link T}.
     */
    T get(int id);
    /**
     * Método para elimiar objeto.
     * @param id
     *       Id del objeto a eliminar.
     */
    void delete(int id);
    /**
     * Método para actualizar el objeto creado.
     * @param t
     *      Tipo a actualizar.
     * @param id
     *      Id del objeto a actualizar
     * @return {@link T}.
     */
    T update(T t, int id);
}

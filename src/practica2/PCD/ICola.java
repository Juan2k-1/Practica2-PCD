/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practica2.PCD;

/**
 *
 * @author juald
 */
public interface ICola {

    /**
     *
     * @return El numero de elementos de la cola
     */
    public int getNum();

    /**
     *
     * @param elemento Elemento a insertar
     * @throws Exception Si la cola está llena
     */
    public void acola(Object elemento) throws java.lang.Exception;

    /**
     *
     * @return El elemento extraído
     * @throws Exception Si la cola está vacía
     */
    public Object desacola() throws java.lang.Exception;

    /**
     *
     * @return Devuelve el primer elemento de la cola
     * @throws Lanza una excepción si la cola está vacía
     */
    public Object primero() throws java.lang.Exception;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.PCD;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juald
 */
public class Consumidor implements Runnable {

    private ColaLenta cola;

    public Consumidor(ColaLenta cola) {
        this.cola=cola;
    }

    /**
     *
     * @throws java.lang.Exception
     */
    public void consumir() throws Exception {
        for (int i = 0; i < 10; i++) {
            Object desacola = this.cola.desacola();
            System.out.println("El identificador del hilo es: " + Thread.currentThread().getId() + " y el numero extraido es: " + desacola);        
        }
    }

    /**
     * 
     */
    @Override
    public void run() {
        try {
            consumir();
        } catch (Exception ex) {
            //System.out.println("Excepcion al extraer los numeros capturada " + ex.getMessage());
            Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}

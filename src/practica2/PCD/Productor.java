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
public class Productor extends Thread {
    private ColaLenta cola;
    
    public Productor(ColaLenta cola) {
        this.cola = cola;
    }
    
    /**
     *
     * @throws java.lang.Exception
     */
    public void producir() throws Exception {
        for (int i = 0; i < 10; i++) {
            float introducido = (float) (1.5 + i);
            System.out.println("El identificador del hilo es: " + this.getId() + " y el numero introducido es: " + introducido);
            this.cola.acola(introducido);         
        }
    }
    
    /**
     *
     */
    @Override
    public void run() {
        try {
            producir();
        } catch (Exception ex) {
            Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

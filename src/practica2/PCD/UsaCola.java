/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2.PCD;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juald
 */
public class UsaCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ColaLenta cola = new ColaLenta(10);
        
        Thread hilo1 = new Thread(new Productor(cola));
        Thread hilo2 = new Thread(new Consumidor(cola));
        Thread hilo3 = new Thread(new Consumidor(cola));     
    
        hilo1.start();
        
        try {
            hilo1.join();        
        } catch (InterruptedException ex) {
            System.out.println("Capturada execpcion de join " + ex.getMessage());
        }
        
        hilo2.start();
        hilo3.start(); 
              
        try {
            hilo2.join();
            hilo3.join();
        } catch (InterruptedException ex) {
            System.out.println("Capturada execpcion de join " + ex.getMessage());
        }   
    }
}

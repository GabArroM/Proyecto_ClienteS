/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author Tom
 */
import java.util.concurrent.Semaphore;

public class Parqueo {
    private int capacidad;
    private Semaphore semaforo; 
    private static final int PRECIO_POR_HORA = 10; 
    private boolean[] espaciosDisponibles;

    public Parqueo(int capacidad) {
        this.capacidad = capacidad;
        semaforo = new Semaphore(capacidad); 
        espaciosDisponibles = new boolean[capacidad]; 
        for (int i = 0; i < capacidad; i++) {
            espaciosDisponibles[i] = true; 
        }
    }

    public void estacionar(int idCarro) {
        try {
            semaforo.acquire(); 
            int espacio = encontrarEspacioDisponible(); 
            if (espacio != -1) {
                espaciosDisponibles[espacio] = false; 
                System.out.println("Carro " + idCarro + " estacionado en el espacio " + espacio);
                
                
                int horasEstacionado = (int) (Math.random() * 5) + 1;
                Thread.sleep(horasEstacionado * 1000);

                int costo = horasEstacionado * PRECIO_POR_HORA;
                System.out.println("Carro " + idCarro + " se ha retirado del espacio " + espacio + ". Costo:$ " + costo + "Horas "+ horasEstacionado);

                semaforo.release(); 
                espaciosDisponibles[espacio] = true;
            } else {
                System.out.println("No hay espacios disponibles para estacionar el carro " + idCarro);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int encontrarEspacioDisponible() {
        for (int i = 0; i < capacidad; i++) {
            if (espaciosDisponibles[i]) {
                return i; 
            }
        }
        return -1; 
    }
}
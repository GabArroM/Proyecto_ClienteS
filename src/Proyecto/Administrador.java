/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author mdees
 */
public class Administrador {
   private Parqueo[] espacios;
    private int contador;

    public Administrador(int tamano) {
        this.espacios = new Parqueo[tamano];
        this.contador = 0;
    }

   public void agregarEspacio(String id, String numeroPlaca, String nombreCarro) {
        if (contador < espacios.length) {
            this.espacios[contador] = new Parqueo(id, numeroPlaca, nombreCarro);
            contador++;
        } else {
            System.out.println("No hay más espacio para agregar estacionamientos.");
        }
    }



    public void eliminarEspacio(String id) {
    for (int i = 0; i < contador; i++) {
        if (espacios[i].getId().equals(id)) {
            for (int j = i; j < contador - 1; j++) {
                espacios[j] = espacios[j + 1];
            }
            espacios[contador - 1] = null;
            contador--;
            break;
        }
    }
}

 public Parqueo buscarEspacio(String id) {
    for (int i = 0; i < contador; i++) {
        if (espacios[i].getId().equals(id)) {
            return espacios[i];
        }
    }
    return null;
}
}


 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocsp;

import Ingresar.ingreso;

/**
 *
 * @author Usuario
 */
public class DisponibilidadParqueo extends Thread {
    private Parqueo parqueo;
    private int intervalo;
    private ingreso vista; // Campo para almacenar la referencia a la vista

    DisponibilidadParqueo(Parqueo parqueo, int intervalo) {
        this.parqueo = parqueo;
        this.intervalo = intervalo;
        this.vista = null; // Inicialmente no hay referencia a la vista
    }

    // Método para establecer la referencia a la vista
    public void setVista(ingreso vista) {
        this.vista = vista;
    }

    @Override
    public void run() {
        while (true) {
            contarEspaciosOcupados();

            // Si hay una referencia a la vista y el campo de texto de espacios ocupados no es nulo
            if (vista != null && vista.txtOcupados != null) {
                // Actualizar el campo de texto en la vista con el número de espacios ocupados
                vista.txtOcupados.setText(String.valueOf(contarEspaciosOcupados()));
            }

            try {
                Thread.sleep(intervalo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    

    // Método para contar espacios ocupados
    public int contarEspaciosOcupados() {
        int espaciosOcupados = 0;
        for (Espacio espacio : parqueo.getEspacios()) {
            if (espacio != null && espacio.estaOcupado()) {
                espaciosOcupados++;
            }
        }
        return espaciosOcupados;
    }
    
    public String mensajeMostrar(int disponibles) {
        int  cantidad = contarEspaciosOcupados();
        String s = "";
        if (cantidad == disponibles) {
                s="¡Todos los espacios del parqueo están llenos!";
            } else if (cantidad >= disponibles / 2) {
                s="¡La mitad de los espacios del parqueo están llenos!";
            } else if (cantidad >= 1) {
                s="¡Algunos espacios del parqueo estan seindo Usados!";
                
            } else if (cantidad == 0) {
                s="¡El parqueo esta vacio!";
            }
        return s;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocsp;

import Ingresar.ingreso;

/**
 *
 * @author Usuario
 */
public class ParqueoProyecto {

    public static void main(String[] args) {
        
        
        
        Parqueo modC = new Parqueo(100);
        ingreso frm = new ingreso();
        
        ControlInterfazes ctrl= new ControlInterfazes(modC,frm);
        ctrl.iniciar();
        frm.setVisible(true);
        
//       Parqueo parqueo = new Parqueo(10);
//       
//        DisponibilidadParqueo estadoThread = new DisponibilidadParqueo(parqueo, 1000); // Intervalo de 5000 milisegundos (5 segundos)
//        estadoThread.start();
//        
//        
//        // Crear un parqueo con 10 espacios
//       
//
//        // Obtener el estado del parqueo
//        String estadoParqueo = parqueo.obtenerEstadoParqueo();
//        System.out.println("Estado inicial del parqueo:");
//        System.out.println(estadoParqueo);
//
//        // Agregar datos a un espacio específico
//        parqueo.agregarDatos(0, "ABC123", true); // Agregar un auto al espacio 0
//        parqueo.agregarDatos(1, "DEF456", false); // Agregar una moto al espacio 1
//
//        // Modificar los datos de un espacio
//        parqueo.modificarDatos(0, "XYZ789"); // Modificar la placa del auto en el espacio 0
//
//        // Obtener el estado actualizado del parqueo
//        estadoParqueo = parqueo.obtenerEstadoParqueo();
//        System.out.println("\nEstado del parqueo después de agregar y modificar datos:");
//        System.out.println(estadoParqueo);
//
//        // Quitar datos de un espacio
//        parqueo.quitarDatos(1); // Quitar la moto del espacio 1
//
//        // Obtener el estado final del parqueo
//        estadoParqueo = parqueo.obtenerEstadoParqueo();
//        System.out.println("\nEstado del parqueo después de quitar datos:");
//        System.out.println(estadoParqueo);
    }
        
        
        
}
        


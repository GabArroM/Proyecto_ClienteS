/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocsp;

/**
 *
 * @author Usuario
 */
public class ParqueoProyecto {

    public static void main(String[] args) {
       Parqueo parqueo = new Parqueo(10);
       
        DisponibilidadParqueo estadoThread = new DisponibilidadParqueo(parqueo, 1000); // Intervalo de 5000 milisegundos (5 segundos)
        estadoThread.start();
        
        // Imprimir el estado inicial del parqueo
        System.out.println("Estado inicial del parqueo:");
        parqueo.imprimirEstadoParqueo();
        
        
        
        // Agregar un nuevo espacio de estacionamiento en la posición 5
        Espacio nuevoEspacio = new EspacioAuto(); // Por ejemplo, aquí se agrega un espacio para auto
        parqueo.agregarEspacio(5, nuevoEspacio);
        
        
        
        // Imprimir el estado del parqueo después de agregar el nuevo espacio
        System.out.println("\nEstado del parqueo después de agregar un nuevo espacio:");
        parqueo.imprimirEstadoParqueo();
        
        
        
        // Eliminar el espacio de estacionamiento en la posición 2
        parqueo.eliminarEspacio(2);
        
        
        
        // Imprimir el estado del parqueo después de eliminar un espacio
        System.out.println("\nEstado del parqueo después de eliminar un espacio:");
        parqueo.imprimirEstadoParqueo();
        
        
        
        // Buscar el espacio de estacionamiento en la posición 8
        Espacio espacioBuscado = parqueo.buscarEspacio(8);
        if (espacioBuscado != null) {
            System.out.println("\nEspacio de estacionamiento encontrado en la posición 8:");
            espacioBuscado.imprimirTipo();
        } else {
            System.out.println("\nNo se encontró ningún espacio de estacionamiento en la posición 8.");
        }
        
         // Ocupar un espacio en la posición 0
        parqueo.getEspacios()[3].ocupar();
        
        // Imprimir el estado del parqueo después de ocupar un espacio
        System.out.println("\nEstado del parqueo después de ocupar un espacio:");
        parqueo.imprimirEstadoParqueo();
        
        
        
        // Establecer datos para un espacio para auto en la posición 0
        parqueo.setDatosEspacioAuto(0, "ABC123");
        
        
        
        // Establecer datos para un espacio para motos en la posición 1
        parqueo.setDatosEspacioMotos(1, "XYZ456");
        
        
        
        // Obtener los datos del espacio en la posición 0 y mostrarlos
        String datosEspacio0 = parqueo.obtenerDatosEspacio(0);
        System.out.println("Datos del espacio en la posición 0:\n" + datosEspacio0);
        
        
        
        // Obtener los datos del espacio en la posición 1 y mostrarlos
        String datosEspacio1 = parqueo.obtenerDatosEspacio(1);
        System.out.println("Datos del espacio en la posición 1:\n" + datosEspacio1);
        parqueo.imprimirEstadoParqueo();
        
        
        
    }
        
} 


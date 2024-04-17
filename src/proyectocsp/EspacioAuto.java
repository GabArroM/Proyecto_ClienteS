/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocsp;

/**
 *
 * @author Usuario
 */
public class EspacioAuto extends Espacio {
    
    
   @Override
   public void imprimirTipo() {
       System.out.println("Este es un espacio para autos.");
   }
   public String obtenerDatos() {
        return "Tipo: Espacio Auto\nPlaca: " + getNumeroPlaca();
    }
}

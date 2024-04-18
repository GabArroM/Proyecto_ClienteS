/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocsp;

/**
 *
 * @author Usuario
 */
public class EspacioMotos extends Espacio {
    @Override 
    public String imprimirTipo() {
        return "Este es un espacio para motos.";
    }
    @Override
    public String obtenerDatos() {
        return "Tipo: Espacio Motos\nPlaca: " + getNumeroPlaca();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author mdees
 */
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrador admin = new Administrador(10);

        while (true) {
            String menu = "1. Agregar espacio de estacionamiento\n"
                    + "2. Eliminar espacio de estacionamiento\n"
                    + "3. Buscar espacio de estacionamiento\n"
                    + "4. Salir";
            String opcionStr = JOptionPane.showInputDialog(menu);
            int opcion = Integer.parseInt(opcionStr);

            if (opcion == 1) {
                String id = JOptionPane.showInputDialog("Ingrese el ID del espacio:");
                String numeroPlaca = JOptionPane.showInputDialog("Ingrese el numero de placa del carro: ");
                String MarcaCarro = JOptionPane.showInputDialog("Ingrese la marca del carro:");
                admin.agregarEspacio(id, numeroPlaca, MarcaCarro);
                JOptionPane.showMessageDialog(null, "Espacio agregado.");
            } else if (opcion == 2) {
                String id = JOptionPane.showInputDialog("Ingrese el ID del espacio:");
                admin.eliminarEspacio(id);
                JOptionPane.showMessageDialog(null, "Espacio eliminado.");
            } else if (opcion == 3) {
                String id = JOptionPane.showInputDialog("Ingrese el ID del espacio:");
                Parqueo espacio = admin.buscarEspacio(id);
                if (espacio != null) {
                    JOptionPane.showMessageDialog(null, "Espacio encontrado: " + espacio.getId()
                            + "\nNúmero de placa: " + espacio.getNumeroPlaca()
                            + "\nMarca del carro: " + espacio.getMarcaCarro());
                } else {
                    JOptionPane.showMessageDialog(null, "Espacio no encontrado.");
                }

            } else if (opcion == 4) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}

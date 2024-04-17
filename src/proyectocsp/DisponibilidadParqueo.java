/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocsp;

/**
 *
 * @author Usuario
 */
public class DisponibilidadParqueo extends Thread{
    private Parqueo parqueo;
    private int intervalo;
    
    DisponibilidadParqueo(Parqueo parqueo, int intervalo) {
        this.parqueo = parqueo;
        this.intervalo = intervalo;
    }

    @Override
    public void run() {
        while (true) {
            int totalEspacios = parqueo.getEspacios().length;
            int espaciosOcupados = 0;

            // Contar espacios ocupados
            for (Espacio espacio : parqueo.getEspacios()) {
                if (espacio != null && espacio.estaOcupado()) {
                    espaciosOcupados++;
                }
            }

            // Mostrar estado del parqueo
            if (espaciosOcupados == totalEspacios) {
                System.out.println("¡Todos los espacios del parqueo están llenos!00000000000000000000000000000000000000000000000000");
            } else if (espaciosOcupados == totalEspacios / 2) {
                System.out.println("¡La mitad de los espacios del parqueo están llenos!0000000000000000000000000000000000000000000000000");
            } else if (espaciosOcupados == 0) {
                System.out.println("¡Ningún espacio del parqueo está lleno!00000000000000000000000000000000000000000000000000000000000000000");
            }

            // Esperar el intervalo antes de volver a verificar el estado
            try {
                Thread.sleep(intervalo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

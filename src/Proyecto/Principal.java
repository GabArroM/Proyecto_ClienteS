
package Proyecto;

/**
 *
 * @author Usuario
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Principal {

    public static void main(String[] args) {
<<<<<<< HEAD
        // Creamos una instancia de Parqueo con 20 espacios
        Parqueo parqueo = new Parqueo(20);

        // Creamos un ExecutorService con 10 hilos (simula 10 carros llegando al parqueo simultáneamente)
        ExecutorService ejecutor = Executors.newFixedThreadPool(10);

        // Simulamos la llegada de 10 carros
        for (int i = 1; i <= 10; i++) {
            ejecutor.execute(new Carro(i, parqueo));
        }

        // Terminamos el ExecutorService
        ejecutor.shutdown();
        while (!ejecutor.isTerminated()) ;
=======
        System.out.println("Prueba uno"); 
        System.out.println("Prueba dos");
        System.out.println("Prueba tres");
>>>>>>> 3e5265eca2e70ec514ce4e34a76ddc0e38e67a70
    }
}
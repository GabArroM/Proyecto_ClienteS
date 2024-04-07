
package Proyecto;

/**
 *
 * @author Usuario
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Principal {

    public static void main(String[] args) {

        
        Parqueo parqueo = new Parqueo(20);

       
        ExecutorService ejecutor = Executors.newFixedThreadPool(10);

        
        for (int i = 1; i <= 10; i++) {
            ejecutor.execute(new Carro(i, parqueo));
        }

        
        ejecutor.shutdown();
        while (!ejecutor.isTerminated()) ;

    }
}

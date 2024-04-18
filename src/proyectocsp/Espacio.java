/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocsp;

/**
 *
 * @author Usuario
 */
public abstract class Espacio {     
protected boolean ocupado;   
protected String numeroPlaca;
protected String id;


    public Espacio(String numeroPlaca) {
        this.ocupado = false;
        this.numeroPlaca = numeroPlaca;
        
        
    }

    public Espacio() {
        this.ocupado = false;
    }
   
   public boolean estaOcupado() {
       return ocupado;
   }
   
   public void ocupar() {
       this.ocupado = true;
   }
   
   public void desocupar() {
       this.ocupado = false;
   }
   
   public abstract String imprimirTipo();
   
   public abstract String obtenerDatos();
   
    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }


}

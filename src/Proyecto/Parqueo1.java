/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author mdees
 */
public class Parqueo1 {
    private String id;
    private boolean estaOcupado;
    private boolean estaReservado;
    private String numeroPlaca;
    private String marcaCarro;

   public Parqueo1(String id, String numeroPlaca, String marcaCarro) {
        this.id = id;
        this.estaOcupado = false;
        this.estaReservado = false;
        this.numeroPlaca = numeroPlaca;
        this.marcaCarro = marcaCarro;
   }

   
   public String getNumeroPlaca() {
       return numeroPlaca;
   }
   
   public String getMarcaCarro() {
       return marcaCarro;
   }
    public String getId() {
        return id;
    }

    public boolean estaOcupado() {
        return estaOcupado;
    }

    public void ocupar() {
        if (!estaReservado) {
            this.estaOcupado= true;
        }
    }

    public void desocupar() {
        this.estaOcupado = false;
    }

    public boolean estaReservado() {
        return estaReservado;
    }

    public void reservar() {
        if (!estaOcupado) {
            this.estaReservado = true;
        }
    }

    public void cancelarReserva() {
        this.estaReservado = false;
    }

}

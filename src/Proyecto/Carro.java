/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author Tom
 */
public class Carro implements Runnable {
    private int idCarro;
    private Parqueo parqueo;

    public Carro(int idCarro, Parqueo parqueo) {
        this.idCarro = idCarro;
        this.parqueo = parqueo;
    }

    @Override
    public void run() {
        parqueo.estacionar(idCarro);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocsp;

import Ingresar.ingreso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class ControlInterfazes implements ActionListener{
    private final Parqueo consultas;
    private final ingreso vista;
    private int tamaño;
    public ControlInterfazes(Parqueo consultas, ingreso vista,int tamaño ) {
        this.tamaño = tamaño;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnSalirParqueo.addActionListener(this);
        this.vista.btnIngreso.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnVer.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
    }

    public void iniciar( ) {
        vista.setTitle("Ingress");
        vista.setLocationRelativeTo(null);
        
     
    }
    
    public int getTamaño() {
        return tamaño;
    }
    
    public void limpiar() {
        vista.txtLugar.setText(null);
        vista.txtMatricula.setText(null);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //boton Ingresar
        if (e.getSource() == vista.btnIngreso) {
            String eleccion = JOptionPane.showInputDialog("Ingrese su elección (Auto/Moto):");
            if ("Auto".equals(eleccion)){
            consultas.agregarDatos(Integer.parseInt(vista.txtLugar.getText()), vista.txtMatricula.getText(), true);
            }else if ("Moto".equals(eleccion)) {
            consultas.agregarDatos(Integer.parseInt(vista.txtLugar.getText()), vista.txtMatricula.getText(), false);
            limpiar();
            }
            
            else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado");
            }
        }
        //boton Verparqueo
        if (e.getSource() == vista.btnVer) {
             // Crear un JTextArea para mostrar el estado del parqueo
            JTextArea textArea = new JTextArea(consultas.obtenerEstadoParqueo());
            textArea.setEditable(false); // Para que el texto no sea editable
            textArea.setRows(20); // Establecer el número de filas para que aparezca un scroll vertical

            // Crear un JScrollPane y agregar el JTextArea a él
            JScrollPane scrollPane = new JScrollPane(textArea);

            // Mostrar el cuadro de diálogo con el JScrollPane
            JOptionPane.showMessageDialog(null, scrollPane, "Estado del Parqueo", JOptionPane.INFORMATION_MESSAGE);
            
        }
        //boton buscar
        if (e.getSource() == vista.btnBuscar) {
             JOptionPane.showMessageDialog(null,consultas.obtenerDatosEspacio(Integer.parseInt(vista.txtLugar.getText())));
            
        }
        if (e.getSource() == vista.btnSalirParqueo) {
            consultas.eliminarDatos(Integer.parseInt(vista.txtLugar.getText()));
            limpiar();
            
        }    
        if (e.getSource() == vista.btnActualizar) {
        DisponibilidadParqueo disponibilidadParqueo = new DisponibilidadParqueo(consultas, 5000);

        disponibilidadParqueo.start();
        
            int ocupados = disponibilidadParqueo.contarEspaciosOcupados();
            int sise =getTamaño();
            int disponibles = sise-ocupados;
            
           vista.txtOcupados.setText(String.valueOf(disponibles));
           vista.txtEstado.setText(disponibilidadParqueo.mensajeMostrar(disponibles));
            
        }  
        //boton limpiar
        if (e.getSource() == vista.btnLimpiar) {
            limpiar();
        }
    }

    

}
    


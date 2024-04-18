
package proyectocsp;

import javax.swing.JOptionPane;

public class Parqueo {

    private Espacio[] espacios;

    public Parqueo(int numEspacios) {
        this.espacios = new Espacio[numEspacios];
        for (int i = 0; i < numEspacios; i++) {
            if (i % 2 == 0) {
                espacios[i] = new EspacioAuto();
            } else {
                espacios[i] = new EspacioMotos();
            }
        }
    }

    public Espacio[] getEspacios() {
        return espacios;
    }

    public String obtenerEstadoParqueo() {
    String estadoParqueo = "";

    for (int i = 0; i < espacios.length; i++) {
        estadoParqueo += "=======================================\n";
        estadoParqueo += "Espacio " + i + ": \n";
        if (espacios[i] != null) {
            if (espacios[i].estaOcupado()) {
                estadoParqueo += "Ocupado\n";
            } else {
                estadoParqueo += "Libre\n";
            }
        } else {
            estadoParqueo += "Espacio vacío\n";
        }
    }

    return estadoParqueo;
}
    
    public void agregarDatos(int posicion, String placa, boolean esAuto) {
        if (posicion >= 0 && posicion < espacios.length) {
            if (esAuto && espacios[posicion] instanceof EspacioAuto) {
                EspacioAuto espacioAuto = (EspacioAuto) espacios[posicion];
                espacioAuto.setNumeroPlaca(placa);
                espacioAuto.ocupar();
            } else if (!esAuto && espacios[posicion] instanceof EspacioMotos) {
                EspacioMotos espacioMotos = (EspacioMotos) espacios[posicion];
                espacioMotos.setNumeroPlaca(placa);
                espacioMotos.ocupar();
            } else {
                JOptionPane.showMessageDialog(null,"La posición no corresponde al tipo de vehículo especificado.");
            }
        } else {
            JOptionPane.showMessageDialog(null,"La posición está fuera de rango.");
        }
    }

    public void eliminarDatos(int posicion) {
        
        if (posicion >= 0 && posicion < espacios.length) {
            espacios[posicion].desocupar();
            espacios[posicion].setNumeroPlaca(null);
            JOptionPane.showMessageDialog(null,"Haz logrado salir con exito");
        } else {
            JOptionPane.showMessageDialog(null,"La posición está fuera de rango.");
        }
    }
    
        public String obtenerDatosEspacio(int posicion) {
        if (posicion >= 0 && posicion < espacios.length) {
            if (espacios[posicion] != null) {
                Espacio espacio = espacios[posicion];
                String estado = "=======================================\n";
                estado += "Espacio " + posicion + ": \n";
                estado += espacio.imprimirTipo() + "\n";
                estado += espacio.estaOcupado() ? "Ocupado\n" : "Libre\n";
                estado += espacio.obtenerDatos() + "\n"; // Si hay datos específicos del espacio
                return estado;
            } else {
                return "Espacio vacío\n";
            }
        } else {
            return "La posición está fuera de rango.";
        }
    }
}



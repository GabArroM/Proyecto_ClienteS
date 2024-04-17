
package proyectocsp;

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

    public void imprimirEstadoParqueo() {
        for (int i = 0; i < espacios.length; i++) {
            System.out.println("=======================================");
            System.out.println("Espacio " + i + ": ");
            if (espacios[i] != null) {
                espacios[i].imprimirTipo();
                if (espacios[i].estaOcupado()) {
                    System.out.println("Ocupado");
                } else {
                    System.out.println("Libre");
                }
            } else {
                System.out.println("Espacio vacío");
            }
        }
    }

    public void agregarEspacio(int posicion, Espacio espacio) {
        if (posicion >= 0 && posicion < espacios.length) {
            espacios[posicion] = espacio;
        } else {
            System.out.println("La posición está fuera de rango.");
        }
    }

    public void eliminarEspacio(int posicion) {
        if (posicion >= 0 && posicion < espacios.length) {
            espacios[posicion] = null;
        } else {
            System.out.println("La posición está fuera de rango.");
        }
    }

    public Espacio buscarEspacio(int posicion) {
        if (posicion >= 0 && posicion < espacios.length) {
            return espacios[posicion];
        } else {
            System.out.println("La posición está fuera de rango.");
            return null;
        }
    }

    public void setDatosEspacioAuto(int posicion, String placa) {
        establecerDatosEspacio(posicion, placa, EspacioAuto.class);
    }

    public void setDatosEspacioMotos(int posicion, String placa) {
        establecerDatosEspacio(posicion, placa, EspacioMotos.class);
    }

    private void establecerDatosEspacio(int posicion, String placa, Class<? extends Espacio> tipoEspacio) {
        if (posicion >= 0 && posicion < espacios.length && tipoEspacio.isInstance(espacios[posicion])) {
            Espacio espacio = espacios[posicion];
            espacio.setNumeroPlaca(placa);
            espacio.ocupar();
        } else {
            System.out.println("La posición no es válida o no corresponde al tipo de espacio especificado.");
        }
    }

    public String obtenerDatosEspacio(int posicion) {
        if (posicion >= 0 && posicion < espacios.length && espacios[posicion] != null) {
            return espacios[posicion].obtenerDatos();
        } else {
            return "La posición no es válida o está vacía.";
        }
    }
}

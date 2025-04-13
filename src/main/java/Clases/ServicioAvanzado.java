
package Clases;

import java.util.ArrayList;


public class ServicioAvanzado extends Servicio {
    private int cantidadGuardias;
    private int cantidadSupervisores;
    private int numElementosCaninos;
    
    public ServicioAvanzado(String codigo, String nombre, String responsable, int cantidadGuardias, int cantidadSupervisores, int numElementosCaninos) {
        super(codigo, nombre, responsable);
        this.cantidadGuardias = cantidadGuardias;
        this.cantidadSupervisores = cantidadSupervisores;
        this.numElementosCaninos = numElementosCaninos;
    }

    public int getCantidadGuardias() {
        return cantidadGuardias;
    }

    public void setCantidadGuardias(int cantidadGuardias) {
        this.cantidadGuardias = cantidadGuardias;
    }

    public int getCantidadSupervisores() {
        return cantidadSupervisores;
    }

    public void setCantidadSupervisores(int cantidadSupervisores) {
        this.cantidadSupervisores = cantidadSupervisores;
    }

    public int getNumElementosCaninos() {
        return numElementosCaninos;
    }

    public void setNumElementosCaninos(int numElementosCaninos) {
        this.numElementosCaninos = numElementosCaninos;
    }
  
}

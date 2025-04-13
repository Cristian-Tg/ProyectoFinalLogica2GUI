
package Clases;

public class ServicioBasico extends Servicio {
    private int cantidadGuardias;
    private int cantidadSupervisores;

     public ServicioBasico(String codigo, String nombre, String responsable, int cantidadGuardias, int cantidadSupervisores) {
        super(codigo, nombre, responsable);
        this.cantidadGuardias = cantidadGuardias;
        this.cantidadSupervisores = cantidadSupervisores;
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
    
   
}


package Clases;


public class Monitoreo extends Servicio {
    private int numCamaras;
    private String tipo;

    public Monitoreo(String codigo, String nombre ,String responsable, int numCamaras, String tipoServicio) {
        super(codigo, nombre, responsable);
        this.numCamaras = numCamaras;
        this.tipo = tipoServicio;
    }
    
    public int getNumCamaras() {
        return numCamaras;
    }

    public void setNumCamaras(int numCamaras) {
        this.numCamaras = numCamaras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

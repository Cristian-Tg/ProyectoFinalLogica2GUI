
package Clases;


public class Servicio {
    private String codigo;
    private String nombre;
    private String responsable;

    public Servicio(String codigo, String nombre, String responsable) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.responsable = responsable;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    
}

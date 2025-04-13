
package Clases;


public class Persona {
    private String nombre;
    private String identificacion;
    
    public Persona(String Nombre, String identificacion) {
        this.nombre = Nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    } 
    
}

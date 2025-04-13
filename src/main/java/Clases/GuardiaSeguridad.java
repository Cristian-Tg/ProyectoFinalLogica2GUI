
package Clases;


public class GuardiaSeguridad extends Persona {
    private String idSupervidor;
    
    public GuardiaSeguridad(String idSupervidor, String Nombre, String identificacion) {
        super(Nombre, identificacion);
        this.idSupervidor = idSupervidor;
    }

    public String getIdSupervidor() {
        return idSupervidor;
    }

    public void setIdSupervidor(String idSupervidor) {
        this.idSupervidor = idSupervidor;
    }

   
   
}

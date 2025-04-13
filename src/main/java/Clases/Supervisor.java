
package Clases;

import java.util.ArrayList;


public class Supervisor extends Persona {
    private ArrayList<String> IdGuardias;
    
     public Supervisor(ArrayList<String> idGuardias, String Nombre, String identificacion) {
        super(Nombre, identificacion);
        this.IdGuardias = idGuardias;
    }

    public ArrayList<String> getIdGuardias() {
        return IdGuardias;
    }

    public void setIdGuardias(ArrayList<String> idGuardias) {
        this.IdGuardias = idGuardias;
    }
    
}

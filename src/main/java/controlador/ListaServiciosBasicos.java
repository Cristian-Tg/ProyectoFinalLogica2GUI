
package controlador;


import BaseDatos.BDServiciosBasicos;
import Clases.ServicioBasico;
import java.util.LinkedList;

/**
 *
 * @author Acer
 */
public class ListaServiciosBasicos {
    private LinkedList<ServicioBasico> serviciosBasicos
;    
    public ListaServiciosBasicos() {
        serviciosBasicos = new LinkedList();
    }
     
    //Metodo para retornar el tamaño de la lista
    public int total() {
        return serviciosBasicos.size();
    }
    
    //Metodo para obtener la posicion de la lista
    public ServicioBasico obtener(int indice) {
        return serviciosBasicos.get(indice);
    }
    
    //Metodo para cargar los productos del Archivo Plano a la tabla
    // a traves de la BDProductos
    public void cargarServiciosBasicos() {
        BDServiciosBasicos bd = new BDServiciosBasicos();
        serviciosBasicos = bd.obtener();
    }
 
}

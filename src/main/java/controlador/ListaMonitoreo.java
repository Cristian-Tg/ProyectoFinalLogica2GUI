
package controlador;

import BaseDatos.BDServiciosMonitoreo;
import Clases.Monitoreo;
import java.util.LinkedList;

/**
 *
 * @author Acer
 */
public class ListaMonitoreo {
    private LinkedList<Monitoreo> monitoreo;
    
    public ListaMonitoreo() {
        monitoreo = new LinkedList();
    }
     
    //Metodo para retornar el tamaño de la lista
    public int total() {
        return monitoreo.size();
    }
    
    //Metodo para obtener la posicion de la lista
    public Monitoreo obtener(int indice) {
        return monitoreo.get(indice);
    }
    
    //Metodo para cargar los productos del Archivo Plano a la tabla
    // a traves de la BDProductos
    public void cargarMonitoreo() {
        BDServiciosMonitoreo bd = new BDServiciosMonitoreo();
        monitoreo = bd.obtener();
    }

}

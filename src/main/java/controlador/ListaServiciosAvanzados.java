
package controlador;


import BaseDatos.BDServiciosAvanzados;
import Clases.ServicioAvanzado;
import java.util.LinkedList;

/**
 *
 * @author Acer
 */
public class ListaServiciosAvanzados {
    private LinkedList<ServicioAvanzado > serviciosAvanzados
;    
    public ListaServiciosAvanzados() {
        serviciosAvanzados = new LinkedList();
    }
     
    //Metodo para retornar el tamaño de la lista
    public int total() {
        return serviciosAvanzados.size();
    }
    
    //Metodo para obtener la posicion de la lista
    public ServicioAvanzado obtener(int indice) {
        return serviciosAvanzados.get(indice);
    }
    
    //Metodo para cargar los productos del Archivo Plano a la tabla
    // a traves de la BDProductos
    public void cargarServiciosAvanzados() {
        BDServiciosAvanzados bd = new BDServiciosAvanzados();
        serviciosAvanzados = bd.obtener();
    }
 
}

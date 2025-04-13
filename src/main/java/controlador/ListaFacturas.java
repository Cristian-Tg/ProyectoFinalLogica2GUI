
package controlador;


import Clases.Factura;
import java.util.LinkedList;

/**
 *
 * @author Acer
 */
public class ListaFacturas {
    private LinkedList<Factura> facturas;
    
    public ListaFacturas() {
        facturas = new LinkedList();
    }
    
    //Metodo para agregar a la lista
    public void agregar(Factura a){
        facturas.add(a);
    }
    
    //Metodo para eliminar de la lista
    public void eliminar(int indice){
        facturas.remove(indice);
        
    }
    
    //Metodo para retornar el tamaño de la lista
    public int total() {
        return facturas.size();
    }
    
    //Metodo para obtener la posicion de la lista
    public Factura obtener(int indice) {
        return facturas.get(indice);
    }
    
}

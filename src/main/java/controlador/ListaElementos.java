
package controlador;

import BaseDatos.BDServicios;
import Clases.Elemento;
import java.util.LinkedList;

/**
 *
 * @author Acer
 */
public class ListaElementos {
    private LinkedList<Elemento> elementos;
;    
    public ListaElementos() {
        elementos = new LinkedList();
    }
    
    //Metodo para agregar a la lista
    public void agregar(Elemento s){
        elementos.add(s);
    }
    
    //Metodo para eliminar de la lista
    public void eliminar(int indice){
        elementos.remove(indice);
       
    }
    
    public void modificar(int indice, String elemento, int valor) {
        Elemento e = obtener(indice);
        e.setElemento(elemento);
        e.setValor(valor);
    }
    
    //Metodo para retornar el tamaño de la lista
    public int total() {
        return elementos.size();
    }
    
    //Metodo para obtener la posicion de la lista
    public Elemento obtener(int indice) {
        return elementos.get(indice);
    }
}
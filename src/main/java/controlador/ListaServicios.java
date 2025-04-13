
package controlador;

import BaseDatos.BDServicios;
import Clases.Servicio;
import java.util.LinkedList;

/**
 *
 * @author Acer
 */
public class ListaServicios {
    private LinkedList<Servicio> servicios
;    
    public ListaServicios() {
        servicios = new LinkedList();
    }
    
    //Metodo para agregar a la lista
    public void agregar(Servicio s){
        servicios.add(s);
    }
    
    //Metodo para eliminar de la lista
    public void eliminar(int indice){
        servicios.remove(indice);
       
    }
    
    public void modificar(int indice, String codigo, String nombre, String responsable) {
        Servicio servicio = obtener(indice);
        servicio.setNombre(nombre);
        servicio.setResponsable(responsable);
    }
    
    //Metodo para retornar el tamaño de la lista
    public int total() {
        return servicios.size();
    }
    
    //Metodo para obtener la posicion de la lista
    public Servicio obtener(int indice) {
        return servicios.get(indice);
    }
    
    //Metodo para cargar los productos del Archivo Plano a la tabla
    // a traves de la BDProductos
    public void cargarServicios() {
        BDServicios bd = new BDServicios();
        servicios = bd.obtener();
    }
 
    //Metodo para guardar los datos en el archivo plano
    // a traves de los metodos de la BDProductos
    public void guardarEnArchivo() {
        BDServicios bd = new BDServicios();
        boolean clean = bd.borrarTodo();
        if (clean) {
            for (int i = 0; i < servicios.size(); i++) {
                bd.registrarServicio(servicios.get(i));
            }
        }
    }
}

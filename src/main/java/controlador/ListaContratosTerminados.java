
package controlador;

import BaseDatos.BDContratosTerminados;
import Clases.Contrato;
import Clases.Servicio;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Acer
 */
public class ListaContratosTerminados {
    private LinkedList<Contrato> contratos;
    
    public ListaContratosTerminados() {
        contratos = new LinkedList();
    }
    
    //Metodo para agregar a la lista
    public void agregar(Contrato a){
        contratos.add(a);
    }
    
    //Metodo para eliminar de la lista
    public void eliminar(int indice){
        contratos.remove(indice);
        
    }
    
    public void modificar(int indice, Date fechaPrestacion, int duracion, Servicio servicio) {
        Contrato contrato = obtener(indice);
        contrato.setFechaPrestacion(fechaPrestacion);
        contrato.setDuracion(duracion);
        contrato.setServicio(servicio);
    }
    
    //Metodo para retornar el tamaño de la lista
    public int total() {
        return contratos.size();
    }
    
    //Metodo para obtener la posicion de la lista
    public Contrato obtener(int indice) {
        return contratos.get(indice);
    }
    
    //Metodo para cargar los productos del Archivo Plano a la tabla
    // a traves de la BDProductos
    public void cargarContratos() {
        BDContratosTerminados bd = new BDContratosTerminados();
        contratos = bd.obtener();
    }
 
    //Metodo para guardar los datos en el archivo plano
    // a traves de los metodos de la BDProductos
    public void guardarEnArchivo() {
        BDContratosTerminados bd = new BDContratosTerminados();
        boolean clean = bd.borrarTodo();
        if (clean) {
            for (int i = 0; i < contratos.size(); i++) {
                bd.registrarContrato(contratos.get(i));
            }  
        }
    }
}

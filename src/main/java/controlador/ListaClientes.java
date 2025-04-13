
package controlador;

import BaseDatos.BDClientes;
import Clases.Cliente;
import java.util.LinkedList;

/**
 *
 * @author Acer
 */
public class ListaClientes {
    private LinkedList<Cliente> clientes;
    
    public ListaClientes() {
        clientes = new LinkedList();
    }
    
    //Metodo para agregar a la lista
    public void agregar(Cliente a){
        clientes.add(a);
    }
    
    //Metodo para eliminar de la lista
    public void eliminar(int indice){
        clientes.remove(indice);
//        guardarEnArchivo();
    }
    
    public void modificar(int indice, String nombre, String tipoCliente, String sector, int calificacion) {
        Cliente cliente = obtener(indice);
        cliente.setNombre(nombre);
        cliente.setTipoCliente(tipoCliente);
        cliente.setSector(sector);
        cliente.setCalificacion(calificacion);
    }
    
    //Metodo para retornar el tamaño de la lista
    public int total() {
        return clientes.size();
    }
    
    //Metodo para obtener la posicion de la lista
    public Cliente obtener(int indice) {
        return clientes.get(indice);
    }
    
    //Metodo para cargar los productos del Archivo Plano a la tabla
    // a traves de la BDProductos
    public void cargarClientes() {
        BDClientes bd = new BDClientes();
        clientes = bd.obtener();
    }
 
    //Metodo para guardar los datos en el archivo plano
    // a traves de los metodos de la BDProductos
    public void guardarEnArchivo() {
        BDClientes bd = new BDClientes();
        bd.borrarTodo();
        for (int i = 0; i < clientes.size(); i++) {
            bd.registrarCliente(clientes.get(i));
        }
    }
}

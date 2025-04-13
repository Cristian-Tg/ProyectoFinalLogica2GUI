
package BaseDatos;

import Clases.Cliente;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class BDClientes {
    
    public LinkedList<Cliente> obtener(){
        LinkedList<Cliente> clientes = null;
        Archivo archivo = new Archivo("clientes.txt");
        LinkedList<String> lineas = archivo.obtenerTextoDelArchivo();
        if (lineas != null) {
            clientes = new LinkedList(); 
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer tokens = new StringTokenizer(linea,";");
                String identificacion = tokens.nextToken();
                String nombre = tokens.nextToken();
                String tipo = tokens.nextToken();
                String sector = tokens.nextToken();
                int calificacion = Integer.parseInt(tokens.nextToken());
                clientes.add(new Cliente(tipo, calificacion, sector,nombre, identificacion));
            }
        }
        return clientes;
    }
    
    public boolean registrarCliente(Cliente c) {
        Archivo archivo = new  Archivo("clientes.txt");
        return archivo.registrar(c.getIdentificacion()+ ";"
               + c.getNombre() + ";"
               + c.getTipoCliente()+ ";"
               + c.getSector()+ ";" + c.getCalificacion());   
    }
    // Metodo para borrar todo el contenido del archivo plano
    public boolean borrarTodo(){
     Archivo archivo =  new Archivo("clientes.txt");
     return  archivo.borrarContenido();
    }
}


package BaseDatos;

import Clases.ServicioAvanzado;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class BDServiciosAvanzados {
    
    public LinkedList<ServicioAvanzado> obtener(){
        LinkedList<ServicioAvanzado> servicios = null;
        Archivo archivo = new Archivo("servicios_avanzados.txt");
        LinkedList<String> lineas = archivo.obtenerTextoDelArchivo();
        if (lineas != null) {
            servicios = new LinkedList(); 
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer tokens = new StringTokenizer(linea,";");
                String codigo = tokens.nextToken();
                String nombre = tokens.nextToken();
                String responsable = tokens.nextToken();
                int cantidadGuardias = Integer.parseInt(tokens.nextToken());
                int cantidadSupervisores = Integer.parseInt(tokens.nextToken());
                int numElementosCaninos = Integer.parseInt(tokens.nextToken());
                servicios.add(new ServicioAvanzado(codigo,nombre, responsable, cantidadGuardias, cantidadSupervisores, numElementosCaninos));
            }
        }
        return servicios;
    }
    
    public boolean registrarServicio(ServicioAvanzado sa) {
        Archivo archivo = new  Archivo("servicios_avanzados.txt");
        return archivo.registrar(sa.getCodigo()+ ";"
               + sa.getNombre() + ";"
               + sa.getResponsable() + ";"
               + sa.getCantidadGuardias() + ";"
               + sa.getCantidadSupervisores() + ";"
               + sa.getNumElementosCaninos());   
    }
    
    // Metodo para borrar todo el contenido del archivo plano
    public boolean borrarTodo(){
     Archivo archivo =  new Archivo("servicios_avanzados.txt");
     return  archivo.borrarContenido();
    }
}

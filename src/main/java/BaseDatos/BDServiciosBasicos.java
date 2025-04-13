
package BaseDatos;


import Clases.ServicioBasico;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class BDServiciosBasicos {
    
    public LinkedList<ServicioBasico> obtener(){
        LinkedList<ServicioBasico> servicios = null;
        Archivo archivo = new Archivo("servicios_basicos.txt");
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
                servicios.add(new ServicioBasico(codigo,nombre, responsable, cantidadGuardias, cantidadSupervisores));
            }
        }
        return servicios;
    }
    
    public boolean registrarServicio(ServicioBasico sb) {
        Archivo archivo = new  Archivo("servicios_basicos.txt");
        return archivo.registrar(sb.getCodigo()+ ";"
               + sb.getNombre() + ";"
               + sb.getResponsable() + ";"
               + sb.getCantidadGuardias() + ";"
               + sb.getCantidadSupervisores());   
    }
    
    // Metodo para borrar todo el contenido del archivo plano
    public boolean borrarTodo(){
     Archivo archivo =  new Archivo("servicios_basicos.txt");
     return  archivo.borrarContenido();
    }
}

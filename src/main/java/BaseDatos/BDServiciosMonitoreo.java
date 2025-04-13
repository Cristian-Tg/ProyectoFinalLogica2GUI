
package BaseDatos;

import Clases.Monitoreo;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class BDServiciosMonitoreo {
    
    public LinkedList<Monitoreo> obtener(){
        LinkedList<Monitoreo> servicios = null;
        Archivo archivo = new Archivo("servicios_monitoreo.txt");
        LinkedList<String> lineas = archivo.obtenerTextoDelArchivo();
        if (lineas != null) {
            servicios = new LinkedList(); 
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer tokens = new StringTokenizer(linea,";");
                String codigo = tokens.nextToken();
                String nombre = tokens.nextToken();
                String responsable = tokens.nextToken();
                int numCamaras = Integer.parseInt(tokens.nextToken());
                String tipoServicio = tokens.nextToken();
                servicios.add(new Monitoreo(codigo,nombre, responsable, numCamaras, tipoServicio));
            }
        }
        return servicios;
    }
    
    public boolean registrarServicio(Monitoreo sm) {
        Archivo archivo = new  Archivo("servicios_monitoreo.txt");
        return archivo.registrar(sm.getCodigo()+ ";"
               + sm.getNombre() + ";"
               + sm.getResponsable() + ";"
               + sm.getNumCamaras() + ";"
               + sm.getTipo());   
    }
    // Metodo para borrar todo el contenido del archivo plano
    public boolean borrarTodo(){
     Archivo archivo =  new Archivo("servicios_monitoreo.txt");
     return  archivo.borrarContenido();
    }
}

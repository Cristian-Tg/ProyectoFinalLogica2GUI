package BaseDatos;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Archivo{    
    private String nombre;
    
    public Archivo(String nombre) {
        this.nombre=nombre;
    }
    
    // Método para obtener el texto del archivo y almacenarlo en una lista enlazada.
    public LinkedList<String> obtenerTextoDelArchivo() {
        LinkedList<String> lineasDeTexto=null;
        try {            
            File archivo = obtenerArchivo();     
            if (archivo.exists()) {
                lineasDeTexto=new LinkedList();
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                    lineasDeTexto.add(linea);
                }
                br.close();
            } else {
                JOptionPane.showMessageDialog(null, "El archivo de texto no existe");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Se produjo un Error ");
        }
        return lineasDeTexto;
    }

    // Método privado para obtener el archivo a partir de su nombre.
    private File obtenerArchivo() {       
        try {
            URL url = getClass().getClassLoader().getResource("archivos/"+nombre);
            return new File(url.toURI());            
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    // Método para registrar una nueva línea de texto en el archivo.
    public boolean registrar(String linea){
        File archivo=obtenerArchivo();
        try{
            if(archivo.exists()){
                FileWriter fw=new FileWriter(archivo,true);
                BufferedWriter bw=new BufferedWriter(fw);
                PrintWriter pw= new PrintWriter(bw);
                pw.println(linea);
                pw.flush();
                pw.close();
                fw.close();
                return true;
            }
        }catch(Exception error){
            error.printStackTrace();
        }
        return false;
    }
    
    // Método para borrar el contenido del archivo.
    public boolean borrarContenido(){
        try{
            File archivo=obtenerArchivo();
            String directorio=archivo.getParent();
            archivo.delete();
            FileWriter fw = new FileWriter(directorio +"/"+ nombre,true);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return true;
    }
}

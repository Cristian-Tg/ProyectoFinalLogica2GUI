
package BaseDatos;

import Clases.Cliente;
import Clases.Contrato;
import Clases.Servicio;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BDContratosTerminados {
    LinkedList<Cliente> clientes;
    LinkedList<Servicio> servicios;
    SimpleDateFormat dateFormat;

    public BDContratosTerminados() {
        this.clientes = new BDClientes().obtener();
        this.servicios = new BDServicios().obtener();
        this.dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    }
    
    
    public LinkedList<Contrato> obtener() {
        LinkedList<Contrato> contratos = null;
        Archivo archivo = new Archivo("contratos_terminados.txt");
        LinkedList<String> lineas = archivo.obtenerTextoDelArchivo();
        if (lineas != null) {
            contratos = new LinkedList();
            for (int i = 0; i < lineas.size(); i++) {
                String linea = lineas.get(i);
                StringTokenizer tokens = new StringTokenizer(linea,";");
                String codigo = tokens.nextToken();
                Cliente cliente = getCliente(tokens.nextToken());
                Date fechaPrestacion = null;
                try {
                    fechaPrestacion = dateFormat.parse(tokens.nextToken());
                } catch (Exception ex) {
                    Logger.getLogger(BDContratos.class.getName()).log(Level.SEVERE, null, ex);
                }
                int duracion = Integer.parseInt(tokens.nextToken());
                Servicio servicio = getServicio(tokens.nextToken());
                contratos.add(new Contrato(codigo, cliente, fechaPrestacion, duracion, servicio));
            }
        }
        return contratos;
    }
    
    public boolean registrarContrato(Contrato c) {
        Archivo archivo = new  Archivo("contratos_terminados.txt");
        return archivo.registrar(c.getCodigo()+ ";"
               + c.getCliente().getIdentificacion() + ";"
               + dateFormat.format(c.getFechaPrestacion())+ ";"
               + c.getDuracion()+ ";" + c.getServicio().getCodigo());   
    }
    
    // Metodo para borrar todo el contenido del archivo plano
    public boolean borrarTodo(){
     Archivo archivo =  new Archivo("contratos_terminados.txt");
     return  archivo.borrarContenido();
    }
   
    // Metodo para obtener el cliente
    private Cliente getCliente(String identificacion){
        Cliente cliente = null;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getIdentificacion().equals(identificacion)) {
                cliente = clientes.get(i);
                break;
            }
        }
        return cliente;
    }
    
    // Metodo para obtener el servicio
    private Servicio getServicio(String codigo){
        Servicio servicio = null;
        for (int i = 0; i < servicios.size(); i++) {
            if (servicios.get(i).getCodigo().equals(codigo)) {
                servicio = servicios.get(i);
                break;
            }
        }
        return servicio;
    }
}

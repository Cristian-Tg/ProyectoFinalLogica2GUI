
package controlador;

import Clases.Cliente;
import Clases.Contrato;
import Clases.Servicio;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer
 */
public class ModeloContratoTerminado extends AbstractTableModel {
    public ListaContratosTerminados contratos;

    public ModeloContratoTerminado() {
        contratos = new ListaContratosTerminados();
        contratos.cargarContratos();
    }
    
     @Override
    public int getRowCount() {
        return contratos.total();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Contrato aux = contratos.obtener(rowIndex);
        switch (columnIndex) {
            case 0: return aux.getCodigo();
            case 1: return aux.getCliente().getIdentificacion();
            case 2: return String.format("%.2f",aux.getValorMensual());
            case 3: return new SimpleDateFormat("dd/MM/yyyy").format(aux.getFechaPrestacion());
            case 4: return aux.getDuracion();
            case 5: return aux.getTipoDeServicio();
            default: return aux.getServicio().getCodigo();
        }
    }
    
    public Contrato getValuAt(int rowIndex) {
        return contratos.obtener(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "CÓDIGO";
            case 1: return "CLIENTE";
            case 2: return "VALOR MENSUAL";
            case 3: return "FECHA";
            case 4: return "DURACIÓN";
            case 5: return "TIPO DE SERVICIO";
            default: return "SERVICIO";
                
        }
    }
    
    // Metodo para definir los tipos de datos de los campos de la tabla
    @Override
    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 4: return Integer.class;
            default: return String.class;
        }
    }
    
    // Metodo para definir si la tabla puede ser editable
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
   }
    
    // Metodo para registrar los datos del modelo de la tabla a través de la lista
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Contrato aux = contratos.obtener(rowIndex);
        switch (columnIndex) {
            case 0: aux.setCodigo((String)value); 
                break;
            case 1: aux.setCliente((Cliente)value);
                break;
            case 3: aux.setFechaPrestacion((Date)value);
                break;
            case 4: aux.setDuracion((int)value);
                break;
            default: aux.setServicio((Servicio)value);
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    // Metodo para gestionar los datos en la tabla de la lista
    public void agregarContrato(Contrato contrato) {
        contratos.agregar(contrato);
        this.fireTableDataChanged();
    }
    // Metodo para gestionar los datos en la tabla de la lista
    public void eliminarContrato(int indice) {
        contratos.eliminar(indice);
        this.fireTableDataChanged();
    }
    // Metodo para modificar los datos en la tabla de la lista
    public void modificarContrato(int indice, Date fechaPrestacion, int duracion, Servicio servicio){
        contratos.modificar(indice, fechaPrestacion, duracion, servicio);
        this.fireTableDataChanged();
    }
    // Metodo para gestionar los datos en la tabla al archivo plano
    public void guardarEnArchivo() {
        contratos.guardarEnArchivo();
    }
    
    public int obtenerFila(String codigo) {
        int fila = -1;
        for (int i = 0; i < contratos.total(); i++) {
            Contrato c = contratos.obtener(i);
            if (c.getCodigo().equals(i)){
                return i;
            }
        }    
        return fila;
    }
    
    public ListaContratosTerminados filtrarCliente(String identificacion){
        ListaContratosTerminados contratosCliente = new ListaContratosTerminados();
        for (int i = 0; i < contratos.total(); i++) {
            Contrato c = contratos.obtener(i);
            if (c.getCliente().getIdentificacion().equals(identificacion)) {
                contratosCliente.agregar(c);
            }
        }
        return contratosCliente;
    }
       
}

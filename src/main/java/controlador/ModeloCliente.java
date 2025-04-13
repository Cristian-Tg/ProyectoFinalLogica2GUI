
package controlador;

import Clases.Cliente;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer
 */
public class ModeloCliente extends AbstractTableModel {
    public ListaClientes clientes;

    public ModeloCliente() {
        clientes = new ListaClientes();
        clientes.cargarClientes();
    }
    
     @Override
    public int getRowCount() {
        return clientes.total();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente aux = clientes.obtener(rowIndex);
        switch (columnIndex) {
            case 0: return aux.getIdentificacion();
            case 1: return aux.getNombre();
            case 2: return aux.getTipoCliente();
            case 3: return aux.getSector();
            default: return aux.getCalificacion();
        }
    }
    
    public Cliente getValuAt(int rowIndex) {
        return clientes.obtener(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "IDENTIFICACIÓN";
            case 1: return "NOMBRE";
            case 2: return "TIPO";
            case 3: return "SECTOR";
            default: return "CALIFICACIÓN";
                
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
        Cliente aux = clientes.obtener(rowIndex);
        switch (columnIndex) {
            case 0: aux.setIdentificacion((String)value); 
                break;
            case 1: aux.setNombre((String)value);
                break;
            case 2: aux.setTipoCliente((String)value);
                break;
            case 3: aux.setSector((String)value);
                break;
            default: aux.setCalificacion((int)value);
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    // Metodo para gestionar los datos en la tabla de la lista
    public void agregarCliente(Cliente cliente) {
        clientes.agregar(cliente);
        this.fireTableDataChanged();
    }
    // Metodo para gestionar los datos en la tabla de la lista
    public void eliminarCliente(int indice) {
        clientes.eliminar(indice);
        this.fireTableDataChanged();
    }
    // Metodo para modificar los datos en la tabla de la lista
    public void modificarCliente(int indice, String nombre, String tipoCliente, String sector, int calificacion){
        clientes.modificar(indice, nombre, tipoCliente, sector, calificacion);
        this.fireTableDataChanged();
    }
    // Metodo para gestionar los datos en la tabla al archivo plano
    public void guardarEnArchivo() {
        clientes.guardarEnArchivo();
    } 
    
    public Cliente obtener(String identificacion) throws Exception {
        Cliente cliente = null;
        for (int i = 0; i < clientes.total(); i++) {
            Cliente c = clientes.obtener(i);
            if (c.getIdentificacion().equals(identificacion)) {
                cliente = c;
                return cliente;
            }
        }
        throw new Exception();
    }
}

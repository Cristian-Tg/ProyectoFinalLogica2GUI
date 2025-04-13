
package controlador;


import Clases.Servicio;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer
 */
public class ModeloServicio extends AbstractTableModel {
    public ListaServicios servicios;

    public ModeloServicio() {
        servicios = new ListaServicios();
        servicios.cargarServicios();
    }
    
     @Override
    public int getRowCount() {
        return servicios.total();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Servicio aux = servicios.obtener(rowIndex);
        switch (columnIndex) {
            case 0: return aux.getCodigo();
            case 1: return aux.getNombre();    
            default: return aux.getResponsable();
        }
    }
    
    public Servicio getValuAt(int rowIndex) {
        return servicios.obtener(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "CODIGO";
            case 1: return "CLIENTE";
            case 2: return "FECHA";
            case 3: return "DURACION";
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
        Servicio aux = servicios.obtener(rowIndex);
        switch (columnIndex) {
            case 0: aux.setCodigo((String)value); 
                break;
            case 1: aux.setNombre((String)value);
                break;
            default: aux.setResponsable((String)value);
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    // Metodo para gestionar los datos en la tabla de la lista
    public void agregarServicio(Servicio servicio) {
        servicios.agregar(servicio);
        this.fireTableDataChanged();
    }
    // Metodo para gestionar los datos en la tabla de la lista
    public void eliminarServicio(int indice) {
        servicios.eliminar(indice);
        this.fireTableDataChanged();
    }
    // Metodo para modificar los datos en la tabla de la lista
    public void modificarServicio(int indice, String codigo, String nombre, String responsable){
        servicios.modificar(indice, codigo, nombre, responsable);
        this.fireTableDataChanged();
    }
    // Metodo para gestionar los datos en la tabla al archivo plano
    public void guardarEnArchivo() {
        servicios.guardarEnArchivo();
    } 
}

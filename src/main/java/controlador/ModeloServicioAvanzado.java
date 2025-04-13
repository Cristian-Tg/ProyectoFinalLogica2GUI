
package controlador;


import Clases.ServicioAvanzado;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer
 */
public class ModeloServicioAvanzado extends AbstractTableModel {
    public ListaServiciosAvanzados serviciosAvanzados;

    public ModeloServicioAvanzado() {
        serviciosAvanzados = new ListaServiciosAvanzados();
        serviciosAvanzados.cargarServiciosAvanzados();
    }
    
     @Override
    public int getRowCount() {
        return serviciosAvanzados.total();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ServicioAvanzado aux = serviciosAvanzados.obtener(rowIndex);
        switch (columnIndex) {
            case 0: return aux.getCodigo();
            case 1: return aux.getNombre();  
            case 2: return aux.getResponsable();
            case 3: return aux.getCantidadGuardias();
            case 4: return aux.getCantidadSupervisores();
            default: return aux.getNumElementosCaninos();
        }
    }
    
    public ServicioAvanzado getValuAt(int rowIndex) {
        return serviciosAvanzados.obtener(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "CÓDIGO";
            case 1: return "NOMBRE";
            case 2: return "RESPONSABLE";
            case 3: return "GUARDIAS";
            case 4: return "SUPERVISORES";
            default: return "CANINOS";
                
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
        ServicioAvanzado aux = serviciosAvanzados.obtener(rowIndex);
        switch (columnIndex) {
            case 0: aux.setCodigo((String)value); 
                break;
            case 1: aux.setNombre((String)value);
                break;
            case 2: aux.setResponsable((String)value);
                break;
            case 3: aux.setCantidadGuardias((int)value);
                break;
            case 4: aux.setCantidadSupervisores((int)value);
                break;
            default: aux.setNumElementosCaninos((int)value);
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
     
}

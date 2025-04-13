
package controlador;


import Clases.Monitoreo;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer
 */
public class ModeloServicioMonitoreo extends AbstractTableModel {
    public ListaMonitoreo serviciosMonitoreo;

    public ModeloServicioMonitoreo() {
        serviciosMonitoreo = new ListaMonitoreo();
        serviciosMonitoreo.cargarMonitoreo();
    }
    
     @Override
    public int getRowCount() {
        return serviciosMonitoreo.total();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Monitoreo aux = serviciosMonitoreo.obtener(rowIndex);
        switch (columnIndex) {
            case 0: return aux.getCodigo();
            case 1: return aux.getNombre();  
            case 2: return aux.getResponsable();
            case 3: return aux.getNumCamaras();
            default: return aux.getTipo();
        }
    }
    
    public Monitoreo getValuAt(int rowIndex) {
        return serviciosMonitoreo.obtener(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "CÓDIGO";
            case 1: return "NOMBRE";
            case 2: return "RESPONSABLE";
            case 3: return "CÁMARAS";
            default: return "TIPO";
                
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
        Monitoreo aux = serviciosMonitoreo.obtener(rowIndex);
        switch (columnIndex) {
            case 0: aux.setCodigo((String)value); 
                break;
            case 1: aux.setNombre((String)value);
                break;
            case 2: aux.setResponsable((String)value);
                break;
            case 3: aux.setNumCamaras((int)value);
                break;
            default: aux.setTipo((String)value);
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
     
}

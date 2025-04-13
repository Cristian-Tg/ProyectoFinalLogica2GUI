
package controlador;



import Clases.Factura;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer
 */
public class ModeloFactura extends AbstractTableModel {
    public ListaFacturas facturas;

    public ModeloFactura() {
        facturas = new ListaFacturas();
    }
    
     @Override
    public int getRowCount() {
        return facturas.total();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Factura aux = facturas.obtener(rowIndex);
        switch (columnIndex) {
            case 0: return aux.getCliente();
            case 1: return String.format("%.2f", aux.getValorPago());
            case 2: return aux.getMesSeleccionado();
            default: return aux.getContrato();
        }
    }
    
    public Factura getValuAt(int rowIndex) {
        return facturas.obtener(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "CLIENTE";
            case 1: return "VALOR PAGO";
            case 2: return "MES";
            default: return "CONTRATO";    
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
        Factura aux = facturas.obtener(rowIndex);
        switch (columnIndex) {
            case 0: aux.setCliente((String)value); 
                break;
            case 1: aux.setValorPago((float)value);
                break;
            case 3: aux.setMesSeleccionado((int)value);
                break;
            default: aux.setContrato((String)value);
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    public void agregarFactura(Factura factura) {
        facturas.agregar(factura);
        this.fireTableDataChanged();
    }
       
}

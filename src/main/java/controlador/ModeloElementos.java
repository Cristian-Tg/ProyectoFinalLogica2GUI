
package controlador;

import Clases.Cliente;
import Clases.Elemento;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer
 */
public class ModeloElementos extends AbstractTableModel {
    public ListaElementos elementos;

    public ModeloElementos() {
        elementos = new ListaElementos();
    }
    
     @Override
    public int getRowCount() {
        return elementos.total();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Elemento aux = elementos.obtener(rowIndex);
        switch (columnIndex) {
            case 0: return aux.getElemento();
            default: return aux.getValor();
        }
    }
    
    public Elemento getValuAt(int rowIndex) {
        return elementos.obtener(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "ELEMENTO";
            default: return "CANTIDAD";
                
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
        Elemento aux = elementos.obtener(rowIndex);
        switch (columnIndex) {
            case 0: aux.setElemento((String)value); 
                break;
            default: aux.setValor((int)value);
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    // Metodo para gestionar los datos en la tabla de la lista
    public void agregarElemento(Elemento elemento) {
        elementos.agregar(elemento);
        this.fireTableDataChanged();
    }
    // Metodo para gestionar los datos en la tabla de la lista
    public void eliminarElemento(int indice) {
        elementos.eliminar(indice);
        this.fireTableDataChanged();
    }
    // Metodo para modificar los datos en la tabla de la lista
    public void modificarElemento(int indice, String elemento, int valor){
        elementos.modificar(indice, elemento, valor);
        this.fireTableDataChanged();
    }
}

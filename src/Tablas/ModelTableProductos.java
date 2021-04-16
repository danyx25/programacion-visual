
package Tablas;



import clase1conexionbd.Ventas;
import Vistas.GestionContable;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTableProductos extends AbstractTableModel{

    

    private String[] m_colNames = {"CANTIDAD", "DESCRIPCION", "SUBTOTAL", "TOTAL"};
    private List<Ventas> productos;
    private GestionContable gContable;

    public ModelTableProductos(List<Ventas> productos, GestionContable gContable) {
        this.productos = productos;
        this.gContable = gContable;
    }

    @Override
    public int getRowCount() {
        return productos.size();
       
    }
    

    @Override
    public int getColumnCount() {
         return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Ventas productos = this.productos.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return productos.getCantidad();
            case 1:
                return productos.getDescripcion();
            case 2:
                return productos.getPrecioCompraSinIVA();
            case 3:
                double a =productos.getCantidad() * productos.getPrecioCompraSinIVA();
                return a;
        }
        return new String();
    }
    @Override
    public String getColumnName(int column) {
        return m_colNames[column]; //To change body of generated methods, choose Tools | Templates.
    }
     public List<Ventas> getProductos() {
        return productos;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }
  
  public void setProductos(List<Ventas> productos){
      this.productos=productos;
  }

    
}

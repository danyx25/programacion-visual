
package Vistas;

import Utilidad.Utilidades;
import clase1conexionbd.Ventas;
import clase1conexionbd.Persona;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import clase1conexionbd.Proveedores;
import com.toedter.calendar.JDateChooser;

public class GestionInventario {

    private JTextField txtCodProductoInventario;
    private JTextField txtDescripcionInventario;
    private JTextField txtPrecioCompraInventario;
    private JTextField txtPrecioVentaInventario;
    private JTextField txtCantidadProductosInventario;

    public GestionInventario(JTextField txtCodProductoInventario, JTextField txtDescripcionInventario, JTextField txtPrecioCompraInventario, JTextField txtPrecioVentaInventario, JTextField txtCantidadProductosInventario) {
        this.txtCodProductoInventario = txtCodProductoInventario;
        this.txtDescripcionInventario = txtDescripcionInventario;
        this.txtPrecioCompraInventario = txtPrecioCompraInventario;
        this.txtPrecioVentaInventario = txtPrecioVentaInventario;
        this.txtCantidadProductosInventario = txtCantidadProductosInventario;
    }

    public JTextField getTxtCodProductoInventario() {
        return txtCodProductoInventario;
    }

    public void setTxtCodProductoInventario(JTextField txtCodProductoInventario) {
        this.txtCodProductoInventario = txtCodProductoInventario;
    }

    public JTextField getTxtDescripcionInventario() {
        return txtDescripcionInventario;
    }

    public void setTxtDescripcionInventario(JTextField txtDescripcionInventario) {
        this.txtDescripcionInventario = txtDescripcionInventario;
    }

    public JTextField getTxtPrecioCompraInventario() {
        return txtPrecioCompraInventario;
    }

    public void setTxtPrecioCompraInventario(JTextField txtPrecioCompraInventario) {
        this.txtPrecioCompraInventario = txtPrecioCompraInventario;
    }

    public JTextField getTxtPrecioVentaInventario() {
        return txtPrecioVentaInventario;
    }

    public void setTxtPrecioVentaInventario(JTextField txtPrecioVentaInventario) {
        this.txtPrecioVentaInventario = txtPrecioVentaInventario;
    }

    public JTextField getTxtCantidadProductosInventario() {
        return txtCantidadProductosInventario;
    }

    public void setTxtCantidadProductosInventario(JTextField txtCantidadProductosInventario) {
        this.txtCantidadProductosInventario = txtCantidadProductosInventario;
    }

    

    public Ventas guardarEditarInventario() {
        Ventas inventario = new Ventas();
        inventario.setCodProducto(txtCodProductoInventario.getText());
        inventario.setDescripcion(txtDescripcionInventario.getText());
        inventario.setCantProductos(txtCantidadProductosInventario.getText());
        System.out.println(inventario.toString());
        return inventario;
    }
}


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
    private JTextField txtCantidadProductosInventario;
    private JTextField txtDescripcionInventario;
    private JTextField txtPrecioCompraSinIVA;
    private JTextField txtPrecioCompraConIVA;
    private JTextField txtPrecioMayorista;
    private JTextField txtClienteFijo;
    private JTextField txtClienteNormal;
    private JDateChooser JDateFechaCaducidad;
    private JDateChooser JDateFechaRegistro;
    private JDateChooser JDateFechaActualizacion;

    public GestionInventario(JTextField txtCodProductoInventario, JTextField txtCantidadProductosInventario, JTextField txtDescripcionInventario, JTextField txtPrecioCompraSinIVA, JTextField txtPrecioCompraConIVA, JTextField txtPrecioMayorista, JTextField txtClienteFijo, JTextField txtClienteNormal, JDateChooser JDateFechaCaducidad, JDateChooser JDateFechaRegistro, JDateChooser JDateFechaActualizacion) {
        this.txtCodProductoInventario = txtCodProductoInventario;
        this.txtCantidadProductosInventario = txtCantidadProductosInventario;
        this.txtDescripcionInventario = txtDescripcionInventario;
        this.txtPrecioCompraSinIVA = txtPrecioCompraSinIVA;
        this.txtPrecioCompraConIVA = txtPrecioCompraConIVA;
        this.txtPrecioMayorista = txtPrecioMayorista;
        this.txtClienteFijo = txtClienteFijo;
        this.txtClienteNormal = txtClienteNormal;
        this.JDateFechaCaducidad = JDateFechaCaducidad;
        this.JDateFechaRegistro = JDateFechaRegistro;
        this.JDateFechaActualizacion = JDateFechaActualizacion;
    }

    

    public JTextField getTxtCodProductoInventario() {
        return txtCodProductoInventario;
    }

    public void setTxtCodProductoInventario(JTextField txtCodProductoInventario) {
        this.txtCodProductoInventario = txtCodProductoInventario;
    }

    public JTextField getTxtCantidadProductosInventario() {
        return txtCantidadProductosInventario;
    }

    public void setTxtCantidadProductosInventario(JTextField txtCantidadProductosInventario) {
        this.txtCantidadProductosInventario = txtCantidadProductosInventario;
    }

    public JTextField getTxtDescripcionInventario() {
        return txtDescripcionInventario;
    }

    public void setTxtDescripcionInventario(JTextField txtDescripcionInventario) {
        this.txtDescripcionInventario = txtDescripcionInventario;
    }

    public JTextField getTxtPrecioCompraSinIVA() {
        return txtPrecioCompraSinIVA;
    }

    public void setTxtPrecioCompraSinIVA(JTextField txtPrecioCompraSinIVA) {
        this.txtPrecioCompraSinIVA = txtPrecioCompraSinIVA;
    }

    public JTextField getTxtPrecioCompraConIVA() {
        return txtPrecioCompraConIVA;
    }

    public void setTxtPrecioCompraConIVA(JTextField txtPrecioCompraConIVA) {
        this.txtPrecioCompraConIVA = txtPrecioCompraConIVA;
    }

    public JTextField getTxtPrecioMayorista() {
        return txtPrecioMayorista;
    }

    public void setTxtPrecioMayorista(JTextField txtPrecioMayorista) {
        this.txtPrecioMayorista = txtPrecioMayorista;
    }

    public JTextField getTxtClienteFijo() {
        return txtClienteFijo;
    }

    public void setTxtClienteFijo(JTextField txtClienteFijo) {
        this.txtClienteFijo = txtClienteFijo;
    }

    public JTextField getTxtClienteNormal() {
        return txtClienteNormal;
    }

    public void setTxtClienteNormal(JTextField txtClienteNormal) {
        this.txtClienteNormal = txtClienteNormal;
    }

    public JDateChooser getJDateFechaCaducidad() {
        return JDateFechaCaducidad;
    }

    public void setJDateFechaCaducidad(JDateChooser JDateFechaCaducidad) {
        this.JDateFechaCaducidad = JDateFechaCaducidad;
    }

    public JDateChooser getJDateFechaRegistro() {
        return JDateFechaRegistro;
    }

    public void setJDateFechaRegistro(JDateChooser JDateFechaRegistro) {
        this.JDateFechaRegistro = JDateFechaRegistro;
    }

    public JDateChooser getJDateFechaActualizacion() {
        return JDateFechaActualizacion;
    }

    public void setJDateFechaActualizacion(JDateChooser JDateFechaActualizacion) {
        this.JDateFechaActualizacion = JDateFechaActualizacion;
    }
   
    

    public Ventas guardarEditarInventario() {
        Ventas inventario = new Ventas();
        inventario.setCodProducto(txtCodProductoInventario.getText());
        inventario.setCantProductos(txtCantidadProductosInventario.getText());
        inventario.setDescripcion(txtDescripcionInventario.getText());
        inventario.setPrecioCompraSinIVA(Double.parseDouble(txtPrecioCompraSinIVA.getText()));
        inventario.setPrecioCompraConIVA(Double.parseDouble(txtPrecioCompraConIVA.getText()));
        inventario.setPrecioMayorista(Double.parseDouble(txtPrecioMayorista.getText()));
        inventario.setPrecioClienteFjo(Double.parseDouble(txtClienteFijo.getText()));
        inventario.setPrecioClienteNormal(Double.parseDouble(txtClienteNormal.getText()));
        
        System.out.println(inventario.toString());
        return inventario;
    }
}


package Vistas;

import Utilidad.Utilidades;
import clase1conexionbd.Persona;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import clase1conexionbd.Proveedores;

public class GestionProveedor {

    private JTextField txtRucProveedor;
    private JTextField txtRazonSocialProveedor;
    private JTextField txtTipoActividadProveedor;
    private JTextField txtNombreRepresentanteProveedor;
    private JTextField txtApellidoRepresentanteProveedor;
    private JTextField txtTelefonoProveedor;
    private JTextField txtCorreoProveedor;
    private JFrame frameGestionContableProveedor;

    public GestionProveedor(JTextField txtRuc, JTextField txtRazonSocial, JTextField txtTipoActividad, JTextField txtNombreRepresentanteLegal, JTextField txtApellidoRepresentanteLegal, JTextField txtTelefono, JTextField txtcorreo, JFrame frameGestionContableProveedor) {
        this.txtRucProveedor = txtRuc;
        this.txtRazonSocialProveedor = txtRazonSocial;
        this.txtTipoActividadProveedor = txtTipoActividad;
        this.txtNombreRepresentanteProveedor = txtNombreRepresentanteLegal;
        this.txtApellidoRepresentanteProveedor = txtApellidoRepresentanteLegal;
        this.txtTelefonoProveedor = txtTelefonoProveedor;
        this.txtCorreoProveedor = txtCorreoProveedor;
        this.frameGestionContableProveedor = frameGestionContableProveedor;
    }

    public JTextField getTxtRucProveedor() {
        return txtRucProveedor;
    }

    public void setTxtRucProveedor(JTextField txtRucProveedor) {
        this.txtRucProveedor = txtRucProveedor;
    }

    public JTextField getTxtRazonSocialProveedor() {
        return txtRazonSocialProveedor;
    }

    public void setTxtRazonSocialProveedor(JTextField txtRazonSocialProveedor) {
        this.txtRazonSocialProveedor = txtRazonSocialProveedor;
    }

    public JTextField getTxtTipoActividadProveedor() {
        return txtTipoActividadProveedor;
    }

    public void setTxtTipoActividadProveedor(JTextField txtTipoActividadProveedor) {
        this.txtTipoActividadProveedor = txtTipoActividadProveedor;
    }

    public JTextField getTxtNombreRepresentanteProveedor() {
        return txtNombreRepresentanteProveedor;
    }

    public void setTxtNombreRepresentanteProveedor(JTextField txtNombreRepresentanteProveedor) {
        this.txtNombreRepresentanteProveedor = txtNombreRepresentanteProveedor;
    }

    public JTextField getTxtApellidoRepresentanteProveedor() {
        return txtApellidoRepresentanteProveedor;
    }

    public void setTxtApellidoRepresentanteProveedor(JTextField txtApellidoRepresentanteProveedor) {
        this.txtApellidoRepresentanteProveedor = txtApellidoRepresentanteProveedor;
    }

    public JTextField getTxtTelefonoProveedor() {
        return txtTelefonoProveedor;
    }

    public void setTxtTelefonoProveedor(JTextField txtTelefonoProveedor) {
        this.txtTelefonoProveedor = txtTelefonoProveedor;
    }

    public JTextField getTxtCorreoProveedor() {
        return txtCorreoProveedor;
    }

    public void setTxtCorreoProveedor(JTextField txtCorreoProveedor) {
        this.txtCorreoProveedor = txtCorreoProveedor;
    }

    public JFrame getFrameGestionContableProveedor() {
        return frameGestionContableProveedor;
    }

    public void setFrameGestionContableProveedor(JFrame frameGestionContableProveedor) {
        this.frameGestionContableProveedor = frameGestionContableProveedor;
    }


    

//    public void limpiarCamposPersona() {
//        txtCedula.setText(" ");
//        txtNombres.setText(" ");
//        txtApellidos.setText(" ");
//        txtDireccion.setText(" ");
//        txtTelefono.setText(" ");
//        txtCorreo.setText(" ");
//        
//
//    }
    public Proveedores guardarEditarProveedor() {
//        if (txtRuc.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(frameGestionContableProveedor, "EL CAMPO RUC ESTA VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
//            txtRuc.requestFocus();//UBICAR EL CURSOR ENFOCAR EN UN CAMPO
//            return null;
//
//        }
//        if (txtRazonSocial.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(frameGestionContableProveedor, "EL CAMPO RAZON SOCIAL ESTA VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
//            txtRazonSocial.requestFocus();//UBICAR EL CURSOR ENFOCAR EN UN CAMPO
//            return null;
//        }
//        if (txtTipoActividad.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(frameGestionContableProveedor, "EL CAMPO TIPO DE ACTIVIDAD ESTA VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
//            txtTipoActividad.requestFocus();//UBICAR EL CURSOR ENFOCAR EN UN CAMPO
//            return null;
//        }
//        if (txtNombreRepresentanteLegal.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(frameGestionContableProveedor, "EL CAMPO NOMBRE DEL REPRESENTANTE LEGAL ESTA VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
//            txtNombreRepresentanteLegal.requestFocus();//UBICAR EL CURSOR ENFOCAR EN UN CAMPO
//            return null;
//        }
//        if (txtApellidoRepresentanteLegal.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(frameGestionContableProveedor, "EL CAMPO APELLIDO DEL REPRENSENTANTE LEGAL ESTA VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
//            txtApellidoRepresentanteLegal.requestFocus();//UBICAR EL CURSOR ENFOCAR EN UN CAMPO
//            return null;
//        }
//        if (txtTelefono.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(frameGestionContableProveedor, "EL CAMPO TELEFONO ESTA VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
//            txtTelefono.requestFocus();//UBICAR EL CURSOR ENFOCAR EN UN CAMPO
//            return null;
//        }
//        if (txtcorreo.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(frameGestionContableProveedor, "EL CAMPO CORREO ESTA VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
//            txtcorreo.requestFocus();//UBICAR EL CURSOR ENFOCAR EN UN CAMPO
//            return null;
//        }
        Proveedores proveedores = new Proveedores();
        proveedores.setRuc(txtRucProveedor.getText());
        proveedores.setRazonSocial(txtRazonSocialProveedor.getText());
        proveedores.setTipoActividad(txtTipoActividadProveedor.getText());
        proveedores.setNombreRepresentanteLegal(txtNombreRepresentanteProveedor.getText());
        proveedores.setApellidoRepresentanteLegal(txtApellidoRepresentanteProveedor.getText());
        proveedores.setTelefono(txtTelefonoProveedor.getText());
        proveedores.setCorreo(txtCorreoProveedor.getText());
//        proveedores.setDireccion(txt);
        System.out.println(proveedores.toString());
        return proveedores;
    } 
}


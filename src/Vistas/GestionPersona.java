
package Vistas;

import Utilidad.Utilidades;
import clase1conexionbd.Persona;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GestionPersona {

    private JTextField txtCedula;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    private JTextField txtDireccion;
    private JTextField txtCorreo;
    private JTextField txtTelefono;
    private Utilidades utilidades;
    private JFrame frameGestionContable;
    private JComboBox jcbGenero;

    public GestionPersona(JTextField txtCedula, JTextField txtNombres, JTextField txtApellidos, JTextField txtDireccion, JTextField txtCorreo, JTextField txtTelefono, Utilidades utilidades, JFrame frameGestionContable, JComboBox jcbGenero) {
        this.txtCedula = txtCedula;
        this.txtNombres = txtNombres;
        this.txtApellidos = txtApellidos;
        this.txtDireccion = txtDireccion;
        this.txtCorreo = txtCorreo;
        this.txtTelefono = txtTelefono;
        this.utilidades = utilidades;
        this.frameGestionContable = frameGestionContable;
        this.jcbGenero = jcbGenero;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtNombres() {
        return txtNombres;
    }

    public void setTxtNombres(JTextField txtNombres) {
        this.txtNombres = txtNombres;
    }

    public JTextField getTxtApellidos() {
        return txtApellidos;
    }

    public void setTxtApellidos(JTextField txtApellidos) {
        this.txtApellidos = txtApellidos;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public Utilidades getUtilidades() {
        return utilidades;
    }

    public void setUtilidades(Utilidades utilidades) {
        this.utilidades = utilidades;
    }

    public JComboBox getJcbGenero() {
        return jcbGenero;
    }

    public void setJcbGenero(JComboBox jcbGenero) {
        this.jcbGenero = jcbGenero;
    }

    public JFrame getFrameGestionContable() {
        return frameGestionContable;
    }

    public void setFrameGestionContable(JFrame frameGestionContable) {
        this.frameGestionContable = frameGestionContable;
    }

    public void limpiarCamposPersona() {
        txtCedula.setText(" ");
        txtNombres.setText(" ");
        txtApellidos.setText(" ");
        txtDireccion.setText(" ");
        txtTelefono.setText(" ");
        txtCorreo.setText(" ");
        txtTelefono.setText(" ");
        txtCedula.requestFocus();
        jcbGenero.setSelectedItem(0);

    }

    public Persona guardarEditar(boolean isEditar) {
        if (txtCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "EL CAMPO CEDULA ESTA VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCedula.requestFocus();//UBICAR EL CURSOR ENFOCAR EN UN CAMPO
            return null;

        }
        if (!utilidades.validadorDeCedula(txtCedula.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "LA CEDULA INGRESADA NO ES LA CORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        if (txtNombres.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "EL CAMPO NOMBRE ESTA VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNombres.requestFocus();
            return null;
        }
        if (txtApellidos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "EL CAMPO APELLIDO ESTA VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtApellidos.requestFocus();
            return null;
        }
        if (txtDireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "EL CAMPO DIRECCION ESTA VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDireccion.requestFocus();
            return null;
        }
        if (txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "EL CAMPO TELEFONO ESTA VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtTelefono.requestFocus();
            return null;
        }
        if (!utilidades.validarNumero(txtTelefono.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "Los datos ingresados en el telefono no son validos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtTelefono.requestFocus();
            return null;
        }
        if (txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "EL CAMPO CORREO ESTA VACIO", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCorreo.requestFocus();
            return null;
        }
        if (!utilidades.ValidarMail(txtCorreo.getText())) {
            JOptionPane.showMessageDialog(frameGestionContable, "EL CAMPO CORREO ES INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDireccion.requestFocus();
            return null;
        }

        Persona persona = new Persona();
        persona.setCedula(txtCedula.getText());
        persona.setNombre(txtNombres.getText());
        persona.setApellido(txtApellidos.getText());
        persona.setDireccion(txtDireccion.getText());
        persona.setCorreo(txtCorreo.getText());
        persona.setTelefono(txtTelefono.getText());
        persona.setGenero(jcbGenero.getSelectedIndex());
//        if (isEditar) {
//                  persona.setFechaActualizacion(new Date());
//        } else {
//            persona.setFechaRegistro(new Date());
//        }
        System.out.println(persona.toString());
        return persona;

    }
}

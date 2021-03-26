
package clase1conexionbd;

import java.sql.Date;


public class Proveedores {

    private int idProveedores;
    private String ruc;
    private String razonSocial;
    private String tipoActividad;
    private String nombreRepresentanteLegal;
    private String apellidoRepresentanteLegal;
    private String telefono;
    private String correo;
    private String direccion;
    private Date fechaRegistro;
    
    public Proveedores(){
    }

    public Proveedores(int idProveedores, String ruc, String razonSocial, String tipoActividad, String nombreRepresentanteLegal, String apellidoRepresentanteLegal, String telefono, String correo, String direccion, Date fechaRegistro) {
        this.idProveedores = idProveedores;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.tipoActividad = tipoActividad;
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
        this.apellidoRepresentanteLegal = apellidoRepresentanteLegal;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdProveedores() {
        return idProveedores;
    }

    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public String getNombreRepresentanteLegal() {
        return nombreRepresentanteLegal;
    }

    public void setNombreRepresentanteLegal(String nombreRepresentanteLegal) {
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
    }

    public String getApellidoRepresentanteLegal() {
        return apellidoRepresentanteLegal;
    }

    public void setApellidoRepresentanteLegal(String apellidoRepresentanteLegal) {
        this.apellidoRepresentanteLegal = apellidoRepresentanteLegal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    
    @Override
    public String toString() {
        return "Proveedores{" + "idProveedores=" + idProveedores + ", ruc=" + ruc + ", razonSocial=" + razonSocial + ", tipoActividad=" + tipoActividad + ", nombreRepresentanteLegal=" + nombreRepresentanteLegal + ", apellidoRepresentanteLegal=" + apellidoRepresentanteLegal + ", telefono=" + telefono + ", correo=" + correo + ", direccion=" + direccion + ", fechaRegistro=" + fechaRegistro + '}';
    }


    public Object getIdPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

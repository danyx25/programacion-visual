
package clase1conexionbd;

import java.sql.Date;


public class Inventario {

    private int idInventario;
    private String codProducto;
    private String cantProductos;
    private String descripcion;
    private double precioCompraSinIVA;
    private double precioCompraConIVA;
    private double precioMayorista;
    private double precioClienteFjo;
    private double precioClienteNormal;
    private Date fechaCaducidad;
    private Date fechaRegistro;
    private Date fechaActualizacion;

    public Inventario() {

    }

    public Inventario(int idInventario, String codProducto, String cantProductos, String descripcion, double precioCompraSinIVA, double precioCompraConIVA, double precioMayorista, double precioClienteFjo, double precioClienteNormal, Date fechaCaducidad, Date fechaRegistro, Date fechaActualizacion) {
        this.idInventario = idInventario;
        this.codProducto = codProducto;
        this.cantProductos = cantProductos;
        this.descripcion = descripcion;
        this.precioCompraSinIVA = precioCompraSinIVA;
        this.precioCompraConIVA = precioCompraConIVA;
        this.precioMayorista = precioMayorista;
        this.precioClienteFjo = precioClienteFjo;
        this.precioClienteNormal = precioClienteNormal;
        this.fechaCaducidad = fechaCaducidad;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizacion = fechaActualizacion;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(String cantProductos) {
        this.cantProductos = cantProductos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompraSinIVA() {
        return precioCompraSinIVA;
    }

    public void setPrecioCompraSinIVA(double precioCompraSinIVA) {
        this.precioCompraSinIVA = precioCompraSinIVA;
    }

    public double getPrecioCompraConIVA() {
        return precioCompraConIVA;
    }

    public void setPrecioCompraConIVA(double precioCompraConIVA) {
        this.precioCompraConIVA = precioCompraConIVA;
    }

    public double getPrecioMayorista() {
        return precioMayorista;
    }

    public void setPrecioMayorista(double precioMayorista) {
        this.precioMayorista = precioMayorista;
    }

    public double getPrecioClienteFjo() {
        return precioClienteFjo;
    }

    public void setPrecioClienteFjo(double precioClienteFjo) {
        this.precioClienteFjo = precioClienteFjo;
    }

    public double getPrecioClienteNormal() {
        return precioClienteNormal;
    }

    public void setPrecioClienteNormal(double precioClienteNormal) {
        this.precioClienteNormal = precioClienteNormal;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public String toString() {
        return "Inventario{" + "idInventario=" + idInventario + ", codProducto=" + codProducto + ", cantProductos=" + cantProductos + ", descripcion=" + descripcion + ", precioCompraSinIVA=" + precioCompraSinIVA + ", precioCompraConIVA=" + precioCompraConIVA + ", precioMayorista=" + precioMayorista + ", precioClienteFjo=" + precioClienteFjo + ", precioClienteNormal=" + precioClienteNormal + ", fechaCaducidad=" + fechaCaducidad + ", fechaRegistro=" + fechaRegistro + ", fechaActualizacion=" + fechaActualizacion + '}';
    }
}

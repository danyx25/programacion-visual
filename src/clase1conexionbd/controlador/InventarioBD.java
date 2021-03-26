
package clase1conexionbd.controlador;

import clase1conexionbd.Clase1ConexionBD;
import clase1conexionbd.Inventario;
import clase1conexionbd.Proveedores;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class InventarioBD {

    public boolean registrarProducto(Inventario inventario) {
        boolean registrar = false;
        //INTEFAZ DE ACCESO A LA BASE DE DATOS
        Statement stm = null;
        //CONEXION CON LA BASE DE DATOS
        Connection con = null;
        //SENTENCIA SQL
        String sql = "INSERT INTO `ejercicio`.`inventario` (`cod_producto`, `can_producto`, `descripcion`, `precio_compra_sin_iva`, "
                + "`precio_compra_con_iva`, `precio_mayorista`, `precio_cliente_fijo`, `precio_cliente_normal`, `fecha_caducidad`, "
                + "`fecha_registro`, `fecha_actualizacion`) VALUES ('" + inventario.getCodProducto() + "', '" + inventario.getCantProductos() + "',"
                + " '" + inventario.getDescripcion() + "', '" + inventario.getPrecioCompraSinIVA() + "', '" + inventario.getPrecioCompraConIVA() + "',"
                + " '" + inventario.getPrecioMayorista() + "', '" + inventario.getPrecioClienteFjo() + "', '" + inventario.getPrecioClienteNormal() + "', "
                + "'" + inventario.getFechaCaducidad() + "', '" + inventario.getFechaRegistro() + "', '" + inventario.getFechaActualizacion() + "');";
        try {
            //ES UNA INSTANCIA DE LA CONEXION PREVIAMENTE CREADA
            Clase1ConexionBD conexion = new Clase1ConexionBD();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return registrar;

    }

    public boolean editarInventario(Inventario inventario) {
        System.out.println("ACTUALIZAR" + inventario);
        //RETORNO DEL METODO CUANDO SE REALICE LA ACTUALIZACION
        boolean editar = false;
        //INTERFAZ DE ACCESO A LA BASE DE DATOS
        Statement stm = null;
        //CONEXION CON LA BASE DE DATOS 
        Connection con = null;
        //CONTATENANDO LA OPCION DE ACTUALIZACION
        String sql = "UPDATE `ejercicio`.`inventario` SET `cod_producto` = '" + inventario.getCodProducto() + "', "
                + "`can_producto` = '" + inventario.getCantProductos() + "', `descripcion` = '" + inventario.getDescripcion() + "', "
                + "`precio_compra_sin_iva` = '" + inventario.getPrecioCompraSinIVA() + "', `precio_compra_con_iva` = '" + inventario.getPrecioCompraConIVA() + "',"
                + " `precio_mayorista` = '" + inventario.getPrecioMayorista() + "', `precio_cliente_fijo` = '" + inventario.getPrecioClienteFjo() + "', "
                + "`precio_cliente_normal` = " + inventario.getPrecioClienteNormal() + "', `fecha_caducidad` = '" + inventario.getFechaCaducidad() + "',"
                + " `fecha_registro` = '" + inventario.getFechaRegistro() + "', `fecha_actualizacion` = '" + inventario.getFechaActualizacion() + ""
                + "' WHERE (`idinventario` = '" + inventario.getIdInventario() + "');";
        try {
            Clase1ConexionBD conexion = new Clase1ConexionBD();
            con = conexion.conectarBaseDatos();
            //PUENTE ENTRE LA CONEXION Y EL CODIGO 
            stm = con.createStatement();
            stm.execute(sql);
            editar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return editar;
    }

    public boolean eliminarInventario(Inventario inventario) {
        boolean eliminar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "DELETE FROM `ejercicio`.`inventario` WHERE (`idinventario` = '" + inventario.getIdInventario() + "');";
        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return eliminar;
    }

    public List<Inventario> obtenerProductosInventario() {
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;

        String sql = "SELECT * FROM ejercicio.inventario;";

        List<Inventario> ListaInventarios = new ArrayList<Inventario>();

        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodProducto(rs.getString(2));
                c.setCantProductos(rs.getString(3));
                c.setDescripcion(rs.getString(4));
                c.setPrecioCompraSinIVA(rs.getDouble(5));
                c.setPrecioCompraConIVA(rs.getDouble(6));
                c.setPrecioMayorista(rs.getDouble(7));
                c.setPrecioClienteFjo(rs.getDouble(8));
                c.setPrecioClienteNormal(rs.getDouble(9));
                c.setFechaCaducidad(rs.getDate(10));
                c.setFechaRegistro(rs.getDate(11));
                c.setFechaActualizacion(rs.getDate(12));
                ListaInventarios.add(c);

            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return ListaInventarios;
    }

    public List<Inventario> obtenerProductosInventarioCodigo(String codigo) {
        System.out.println("codigo" + codigo);
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;
        String sql = "SELECT * FROM ejercicio.inventario WHERE codigo_pro = '" + codigo + "';";
        List<Inventario> listaInventarioCodigo = new ArrayList<Inventario>();
        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodProducto(rs.getString(2));
                c.setCantProductos(rs.getString(3));
                c.setDescripcion(rs.getString(4));
                c.setPrecioCompraSinIVA(rs.getDouble(5));
                c.setPrecioCompraConIVA(rs.getDouble(6));
                c.setPrecioMayorista(rs.getDouble(7));
                c.setPrecioClienteFjo(rs.getDouble(8));
                c.setPrecioClienteNormal(rs.getDouble(9));
                c.setFechaCaducidad(rs.getDate(10));
                c.setFechaRegistro(rs.getDate(11));
                c.setFechaActualizacion(rs.getDate(12));
                listaInventarioCodigo.add(c);
            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return listaInventarioCodigo;
    }

    public List<Inventario> obtenerProductosInventarioDescripcion(String descripcion) {
        System.out.println("descripcion" + descripcion);
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;
        String sql = "SELECT * FROM ejercicio.inventario WHERE descripcion like \"%" + descripcion + "%\"";
        List<Inventario> listaInventarioDescripcion = new ArrayList<Inventario>();
        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodProducto(rs.getString(2));
                c.setCantProductos(rs.getString(3));
                c.setDescripcion(rs.getString(4));
                c.setPrecioCompraSinIVA(rs.getDouble(5));
                c.setPrecioCompraConIVA(rs.getDouble(6));
                c.setPrecioMayorista(rs.getDouble(7));
                c.setPrecioClienteFjo(rs.getDouble(8));
                c.setPrecioClienteNormal(rs.getDouble(9));
                c.setFechaCaducidad(rs.getDate(10));
                c.setFechaRegistro(rs.getDate(11));
                c.setFechaActualizacion(rs.getDate(12));
                listaInventarioDescripcion.add(c);
            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return listaInventarioDescripcion;
    }

}

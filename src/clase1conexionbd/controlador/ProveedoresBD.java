
package clase1conexionbd.controlador;
import clase1conexionbd.Clase1ConexionBD;
import clase1conexionbd.Persona;
import clase1conexionbd.Proveedores;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ProveedoresBD {
    
    public boolean registrarProveedor(Proveedores proveedor) {
        boolean registrar = false;
        //INTEFAZ DE ACCESO A LA BASE DE DATOS
        Statement stm = null;
        //CONEXION CON LA BASE DE DATOS
        Connection con = null;
        //SENTENCIA SQL        
        String sql = "INSERT INTO `ejercicio`.`proveedores` (`ruc`, `razon_social`, `tipo_actividad`, `nombre_representante_legal`, `apellido_representante_legal`, `telefono`, `correo`, `direccion`, `fecha_registro`) VALUES ('"+proveedor.getRuc()+"', '"+proveedor.getRazonSocial()+"', '"+proveedor.getTipoActividad()+"', '"+proveedor.getNombreRepresentanteLegal()+"', '"+proveedor.getApellidoRepresentanteLegal()+"', '"+proveedor.getTelefono()+"', '"+proveedor.getCorreo()+"', '"+proveedor.getDireccion()+"', '"+proveedor.getFechaRegistro()+"');";
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

    public boolean editarProveedor(Proveedores proveedor) {
        //RETORNO DEL METODO CUANDO SE REALICE LA ACTUALIZACION
        boolean editar = false;
        //INTERFAZ DE ACCESO A LA BASE DE DATOS
        Statement stm = null;
        //CONEXION CON LA BASE DE DATOS 
        Connection con = null;
        //CONTATENANDO LA OPCION DE ACTUALIZACION
        String sql = "UPDATE `ejercicio`.`proveedores` SET `ruc` = '"+proveedor.getRuc()+"', `razon_social` = '"+proveedor.getRazonSocial()+"', `tipo_actividad` = '"+proveedor.getTipoActividad()+"', `nombre_representante_legal` = '"+proveedor.getNombreRepresentanteLegal()+"', `apellido_representante_legal` = '"+proveedor.getApellidoRepresentanteLegal()+"', `telefono` = '"+proveedor.getTelefono()+"', `correo` = '"+proveedor.getCorreo()+"', `direccion` = '"+proveedor.getDireccion()+"', `fecha_registro` = '"+proveedor.getFechaRegistro()+"' WHERE (`id_proveedores` = '"+proveedor.getIdProveedores()+"');";
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

    public boolean eliminarProveedor(Proveedores proveedor) {
        boolean eliminar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "DELETE FROM `ejercicio`.`proveedores` WHERE (`id_proveedores` = '"+proveedor.getIdPersona()+"');";
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
    public List<Proveedores> obtenerProveedores() {
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;

        String sql = "SELECT * FROM ejercicio.proveedores;";

        List<Proveedores> ListaProveedores = new ArrayList<Proveedores>();

        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Proveedores c = new Proveedores();
                c.setIdProveedores(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazonSocial(rs.getString(3));
                c.setTipoActividad(rs.getString(4));
                c.setNombreRepresentanteLegal(rs.getNString(5));
                c.setApellidoRepresentanteLegal(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                c.setFechaRegistro(rs.getDate(10));                
                ListaProveedores.add(c);

            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return ListaProveedores;
    }
    
     public List<Proveedores> obtenerProveedorNombre(String nombre) {
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;
        List<Proveedores> proveedoresEncontrados = new ArrayList<>();
        String sql = "SELECT * FROM ejercicio.proveedores WHERE nombre_representante_legal like \"%" + nombre + "%\"";
        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Proveedores c = new Proveedores();
                c.setIdProveedores(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazonSocial(rs.getString(3));
                c.setTipoActividad(rs.getString(4));
                c.setNombreRepresentanteLegal(rs.getNString(5));
                c.setApellidoRepresentanteLegal(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                c.setFechaRegistro(rs.getDate(10));
                proveedoresEncontrados.add(c);
            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return proveedoresEncontrados;
    }
     public Proveedores obtenerProveedoNombre(String nombre) {
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;
        Proveedores c = null;
        String sql = "SELECT * FROM ejercicio.proveedores WHERE nombre_representante_legal like \"%" + nombre + "%\"";
        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Proveedores();
                c.setIdProveedores(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazonSocial(rs.getString(3));
                c.setTipoActividad(rs.getString(4));
                c.setNombreRepresentanteLegal(rs.getNString(5));
                c.setApellidoRepresentanteLegal(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                c.setFechaRegistro(rs.getDate(10));
            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return c;
    }
    
}


package clase1conexionbd.controlador;

import clase1conexionbd.Clase1ConexionBD;
import clase1conexionbd.Persona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class PersonaBD {

    public boolean registrarPersona(Persona persona) {
        boolean registrar = false;
        //INTEFAZ DE ACCESO A LA BASE DE DATOS
        Statement stm = null;
        //CONEXION CON LA BASE DE DATOS
        Connection con = null;
        String sql;
        if (persona.getFechaNacimiento() == null) {
            sql = "INSERT INTO `ejercicio`.`persona` (`cedula`, `nombres`, `apellidos`, `direccion`, `correo`, `telefono`, `fecha_registro`, `genero`) VALUES ('" + persona.getCedula() + "', '" + persona.getNombre() + "', '" + persona.getApellido() + "', '" + persona.getDireccion() + "', '" + persona.getCorreo() + "', '" + persona.getTelefono() + "', '" + persona.getFechaRegistro() + "', '" + persona.getGenero() + "');";
        }else{
        sql = "INSERT INTO `ejercicio`.`persona` (`cedula`, `nombres`, `apellidos`, `direccion`, `correo`, `telefono`, `fecha_registro`, `genero`, `fecha_nacimiento` ) VALUES ('" + persona.getCedula() + "', '" + persona.getNombre() + "', '" + persona.getApellido() + "', '" + persona.getDireccion() + "', '" + persona.getCorreo() + "', '" + persona.getTelefono() + "', '" + persona.getFechaRegistro() + "', '" + persona.getGenero() + "', '" + persona.getFechaNacimiento()+ "');";
        }

        //SENTENCIA SQL
        
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

    public boolean editarPersona(Persona persona) {
        //RETORNO DEL METODO CUANDO SE REALICE LA ACTUALIZACION
        boolean editar = false;
        //INTERFAZ DE ACCESO A LA BASE DE DATOS
        Statement stm = null;
        //CONEXION CON LA BASE DE DATOS 
        Connection con = null;
        //CONTATENANDO LA OPCION DE ACTUALIZACION
        String sql = "UPDATE `ejercicio`.`persona` SET `cedula` = '" + persona.getCedula() + "', `nombres` = '" + persona.getNombre() + "', `apellidos` = '" + persona.getApellido() + "', `direccion` = '" + persona.getDireccion() + "', `correo` = '" + persona.getCorreo() + "', `telefono` = '" + persona.getTelefono() + "', `fecha_registro` = '" + persona.getFechaRegistro() + "', `genero` = '" + persona.getGenero() + "' WHERE (`idpersona` = '" + persona.getIdPersona() + "');";
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

    public boolean eliminarPersona(Persona persona) {
        boolean eliminar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "DELETE FROM persona WHERE cedula = " + persona.getCedula() + "";
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

    public List<Persona> obtenerPersonas() {
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;

        String sql = "SELECT * FROM ejercicio.persona;";

        List<Persona> listaPersona = new ArrayList<Persona>();

        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFechaRegistro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                //c.setFechaActualizacion(rs.getDate(10));
                listaPersona.add(c);
            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return listaPersona;
    }

    public Persona obtenerPersonCedula(String cedula) {
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;
        Persona c = null;
        String sql = "SELECT * FROM ejercicio.persona WHERE cedula = " + cedula + "";

        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getNString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFechaRegistro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                //c.setFechaActualizacion(rs.getDate(10));

            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return c;
    }

    public Persona obtenerPersonaTelefono(String telefono) {
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;
        Persona c = null;
        String sql = "SELECT * FROM ejercicio.persona WHERE telefono = " + telefono + "";

        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getNString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFechaRegistro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                //c.setFechaActualizacion(rs.getDate(10));

            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return c;

    }

    public List<Persona> obtenerPersonaNombre(String nombre) {
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;
        List<Persona> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM ejercicio.persona WHERE nombre like \"%" + nombre + "%\"";

        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getNString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFechaRegistro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                //c.setFechaActualizacion(rs.getDate(10));
                personasEncontradas.add(c);
            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return personasEncontradas;
    }

    public List<Persona> obtenerPersonaApellidos(String apellidos) {
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;
        List<Persona> personasEncontradasApellido = new ArrayList<>();
        String sql = "SELECT * FROM ejercicio.persona WHERE apellidos like \"%" + apellidos + "%\"";

        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getNString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFechaRegistro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                //c.setFechaActualizacion(rs.getDate(10));
                personasEncontradasApellido.add(c);
            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return personasEncontradasApellido;

    }

    public List<Persona> obtenerPersonaTelefono1(String telefono) {
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;
        List<Persona> personasEncontradasTelefono = new ArrayList<>();
        String sql = "SELECT * FROM ejercicio.persona WHERE telefono like \"%" + telefono + "%\"";
        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getNString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFechaRegistro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                //c.setFechaActualizacion(rs.getDate(10));
                personasEncontradasTelefono.add(c);
            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return personasEncontradasTelefono;

    }

    public List<Persona> obtenerPersonaCorreo(String correo) {
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;
        List<Persona> personasEncontradasCorreo = new ArrayList<>();
        String sql = "SELECT * FROM ejercicio.persona WHERE correo like \"%" + correo + "%\"";
        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdPersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getNString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFechaRegistro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                //c.setFechaActualizacion(rs.getDate(10));
                personasEncontradasCorreo.add(c);
            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return personasEncontradasCorreo;

    }
}

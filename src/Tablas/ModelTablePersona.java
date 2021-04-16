
package Tablas;

import Vistas.GestionContable;
import clase1conexionbd.Persona;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ModelTablePersona extends AbstractTableModel {

    //CREACION DE LOS NOMBRES DE LAS COLUMNAS USANDO ARREGLO
    private String[] m_colNames = {"CEDULA", "NOMBRE", "APELLIDOS", "DIRECCION", "CORREO", "TELEFONO", "FECHA REGISTRO","FECHA DE NACIMIENTO"};
    private List<Persona> personas;
    private GestionContable gContable;

    public ModelTablePersona(List<Persona> persona, GestionContable gContable) {
        this.personas = persona;
        this.gContable = gContable;
    }

//DETERMINA EL NUMERO DE FILAS QUE TENGO EN LA TABLA    
    @Override
    public int getRowCount() {
        return personas.size();
    }
//DETERMINA EL NUMERO DE COLUMNAS QUE TENGO EN LA TABLA

    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona persona = personas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return persona.getCedula();
            case 1:
                return persona.getNombre();
            case 2:
                return persona.getApellido();
            case 3:
                return persona.getDireccion();
            case 4:
                return persona.getCorreo();
            case 5:
                return persona.getTelefono();
            case 6:
                return persona.getFechaRegistro();
            case 7:
                return persona.getFechaNacimiento();

        }
        return new String();
    }
//ESTE METODO SIRVE PARA DEFINIR LOS NOMBRES DE LAS COLUMNAS 

    @Override
    public String getColumnName(int column) {
        //INSERCION DE NOMBRE DE LAS COLUMNAS USANDO EL ARRAY CREADO
        return m_colNames[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        gContable.clickPersona(personas.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

}

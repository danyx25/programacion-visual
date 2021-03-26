
package Tablas;

import clase1conexionbd.Persona;
import clase1conexionbd.Proveedores;
import clase1conexionbd.Inventario;



public interface ComunicacionVistaModeloTablas {
    void clickPersona(Persona p);
    void clickInventario(Inventario p);
    void clickProveedores(Proveedores p);
    
}

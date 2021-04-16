
package Tablas;

import clase1conexionbd.Persona;
import clase1conexionbd.Proveedores;
import clase1conexionbd.Ventas;



public interface ComunicacionVistaModeloTablas {
    void clickPersona(Persona p);
    void clickInventario(Ventas p);
    void clickProveedores(Proveedores p);
   
}

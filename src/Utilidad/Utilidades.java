
package Utilidad;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Utilidades {

    public boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                // Coeficientes de validación cédula
                // El decimo digito se lo considera dígito verificador
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {            
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
            System.out.println("La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
    }

    public boolean validarNumero(String numero) {
        //VERFICIAR SI EL NUMERO COMIENZA EN 0
        // Inserto el numero que debe ir al inicio del patron
        Pattern p = Pattern.compile("[0]");
        // Buscamos las coincidencias el el primer caracter del numero de telefono
        Matcher matcher = p.matcher(numero.substring(0, 1));
        if (matcher.matches()) {
            System.out.println("El telefono empieza por 0");
            return true;
        } else {
            System.out.println("El telefono NO empieza por 0");
        }

        if (numero.isEmpty()) {
            return false;
        } else if (numero.length() < 10) {
            return false;
        }
        try {
            int validarNumero = Integer.parseInt(numero);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean ValidarMail(String email) {
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+");
        // El email a validar
        Matcher mather = pattern.matcher(email);
        if (mather.find() == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarNumeroInventario(String numero) {
        try {
            int validarNumero = Integer.parseInt(numero);
            return true;
        } catch (Exception e) {            
            return false;
        }
    }

}

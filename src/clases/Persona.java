
package clases;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author caemci
 */
public class Persona {
    
    String nombre;
    String apellido;
    char genero;
    String paisDeOrigen;
    String DNI;
    String fechaDeNacimiento;
    String estadoCivil;
    String domicilio;
    String movil;
    String mail;
  
    void presentarse () {
        System.out.println( "\"Hola ! Soy " + nombreCompleto() + ", de " + paisDeOrigen +
                            ". Tengo " + obtenerEdad() + " años y me encuentro " + estadoCivil.toLowerCase() + 
                            ". Escribime a " + mail);
    }

    String nombreCompleto() {
        return nombre + " " + apellido;
    }

    void cambiarDeEstadoCivil(String nuevoEstadoCivil) {
        estadoCivil = nuevoEstadoCivil;
    }
    
    void cambiarDeDomicilio(String nuevoDomicilio) {
        domicilio = nuevoDomicilio;
    }
    
    int obtenerEdad () {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de fecha
        LocalDate fechaNac = LocalDate.parse(fechaDeNacimiento, fmt); // Fecha de nacimiento
        LocalDate ahora = LocalDate.now(); // Fecha actual
        Period periodo = Period.between(fechaNac, ahora); // Período entre las dos fechas
        return periodo.getYears(); // Cantidad de años del período
    }
}

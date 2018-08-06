
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
    
    /* 
        Si no se escribe un constructor, Java implícitamente crea uno por defecto:
    
        Persona () {

        }
    
        Si el programador escribe uno o más constructores, el constructor por defecto se anula.
    */
    
    // Constructor con todos los parámetros
    public Persona(String nom, String ape, char gen, String pais, String DNI, String nac, String est, String dom, String mov, String mail) {
        nombre = nom;
        apellido = ape;
        genero = gen;
        paisDeOrigen = pais;
        /*
            Si se escribe: 
                DNI = DNI
            Se tiene una ambigüedad: ¿Cuál es el atributo y cuál es parámetro?
            El uso de this rompe la ambiguedad. Refiere al objeto actual.
            A través de this, el objeto accede a los atributos y métodos de sí mismo 
        */
        this.DNI = DNI; 
        fechaDeNacimiento = nac;
        estadoCivil = est;
        domicilio = dom;
        movil = mov;
        this.mail = mail;
    }
    
    // Constructor con algunos parámetros
    public Persona(String nombre, String apellido) {
        /*
            Puede usarse el this en cualquier caso, no solo para resolver ambigüedades
        */
        this.nombre = nombre;
        this.apellido = apellido;
        this.paisDeOrigen = "n/a";
        this.DNI = "n/a";
        this.fechaDeNacimiento = "01/01/1900";
        this.estadoCivil = "n/a";
        this.domicilio = "n/a";
        this.movil = "n/a";
        this.mail = "n/a";
    }

    @Override // Indica "sobreescritura" o "redifinición". No es obligatorio, pero es deseable indicarlo.
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", paisDeOrigen=" + paisDeOrigen + ", DNI=" + DNI + ", fechaDeNacimiento=" + fechaDeNacimiento + ", estadoCivil=" + estadoCivil + ", domicilio=" + domicilio + ", movil=" + movil + ", mail=" + mail + '}';
    }  
  
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

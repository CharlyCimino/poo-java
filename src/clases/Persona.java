
package clases;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author caemci
 */
public class Persona {
    
    /*
        ENCAPSULAMIENTO: Se debe garantizar la integridad de los datos de un objeto. No se deben conocer los detalles de implementación.
        Los atributos no se modifican directamente, sino que se utilizan métodos para lectura (getter) y escritura (setter).
        Todos los atributos de un objeto deberían ser privados (únicamente accesibles desde dentro de la clase), con la posible excepción
        de aquellos que sean constantes (final).
    */
    private String nombre;
    private String apellido;
    private char genero;
    /*
        paisDeOrigen, DNI y fechaDeNacimineto no tienen método setter 
        ni tampoco una manera de modificar su valor dentro de la misma clase.
        Conceptualmente, se trata de constantes, por lo que llevan la palabra final delante (no es obligatorio).
    */
    private final String paisDeOrigen;
    private final String DNI;
    private final String fechaDeNacimiento;
    private String estadoCivil;
    private String domicilio;
    private String movil;
    private String mail;
    
    /*
        Un objeto se comunica con el "exterior" a través de sus métodos públicos.
        Todo lo que sea public es accesible desde cualquier lugar.
    */

    public Persona(String nombre, String apellido, char genero, String paisDeOrigen, String DNI, String fechaDeNacimiento, String estadoCivil, String domicilio, String movil, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.paisDeOrigen = paisDeOrigen;
        this.DNI = DNI;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estadoCivil = estadoCivil;
        this.domicilio = domicilio;
        this.movil = movil;
        this.mail = mail;
    }

    @Override // Indica "sobreescritura" o "redifinición". No es obligatorio, pero es deseable indicarlo.
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", paisDeOrigen=" + paisDeOrigen + ", DNI=" + DNI + ", fechaDeNacimiento=" + fechaDeNacimiento + ", estadoCivil=" + estadoCivil + ", domicilio=" + domicilio + ", movil=" + movil + ", mail=" + mail + '}';
    }  
  
    public void presentarse () {
        System.out.println( "\"Hola ! Soy " + nombreCompleto() + ", de " + paisDeOrigen +
                            ". Tengo " + obtenerEdad() + " años y me encuentro " + estadoCivil.toLowerCase() + 
                            ". Escribime a " + mail);
    }
    
    /* 
        nombreCompleto() es un ejemplo de método privado. La devolución del nombre completo es una funcionalidad que
        requiero dentro de la clase, pero no deseo que fuera de la misma se pueda obtener el nombre completo de la persona.
        Por eso nombreCompleto() es private.
        Que un método sea public o private depende del alcance a criterio del programador.
    */

    private String nombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public int obtenerEdad () {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de fecha
        LocalDate fechaNac = LocalDate.parse(fechaDeNacimiento, fmt); // Fecha de nacimiento
        LocalDate ahora = LocalDate.now(); // Fecha actual
        Period periodo = Period.between(fechaNac, ahora); // Período entre las dos fechas
        return periodo.getYears(); // Cantidad de años del período
    }
    
    /* 
        Métodos getter (para obtener un atributo) y setter (para establecer un atributo).
        Gracias a ellos, es posible garantizar la integridad del estado de un objeto.
        Observá en detalle el método setMail()
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }
    
    public String getDNI() {
        return DNI;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        // Solo se actualiza el mail si el String contiene un arroba.
        if ( mail.contains("@") ) {
            this.mail = mail;
        }
    }
}

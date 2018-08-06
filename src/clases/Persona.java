
package clases;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author caemci
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Genero genero;
    private final String paisDeOrigen;
    private final String DNI;
    private final String fechaDeNacimiento;
    private EstadoCivil estadoCivil;
    private String domicilio;
    private String movil;
    private String mail;

    public Persona(String nombre, String apellido, Genero genero, String paisDeOrigen, String DNI, String fechaDeNacimiento, EstadoCivil estadoCivil, String domicilio, String movil, String mail) {
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

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", paisDeOrigen=" + paisDeOrigen + ", DNI=" + DNI + ", fechaDeNacimiento=" + fechaDeNacimiento + ", estadoCivil=" + estadoCivil + ", domicilio=" + domicilio + ", movil=" + movil + ", mail=" + mail + '}';
    }  
  
    public void presentarse () {
        System.out.println( "\"Hola ! Soy " + nombreCompleto() + ", de " + paisDeOrigen +
                            ". Tengo " + obtenerEdad() + " años y me encuentro " + estadoCivil + 
                            ". Escribime a " + mail);
    }

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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
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

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
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
        if ( mail.contains("@") ) {
            this.mail = mail;
        }
    }
}

package clases;

public class Principal {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        
        p1.nombre = "Juan";
        p1.apellido = "Pérez";
        p1.genero = 'M';
        p1.paisDeOrigen = "Argentina";
        p1.DNI = "12345678";
        p1.fechaDeNacimiento = "09/07/1990";
        p1.estadoCivil = "Soltero";
        p1.domicilio = "Bulnes 1526 4to C";
        p1.mail = "jp90@gma1l.com";
        p1.movil = "1123456789";
        
        p1.presentarse();
        p1.cambiarDeEstadoCivil("En pareja");
        p1.presentarse();
    }
    
}

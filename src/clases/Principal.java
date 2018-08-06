
package clases;

public class Principal {

    public static void main(String[] args) {
        
        /* 
            Persona jp = new Persona(); // ERROR
            
            No existe un constructor en la clase Persona que permita instanciar objetos sin parámetros.
            Para que eso funcione, en la clase Persona debería haber un tercer constructor:
        
                Futbolista () {
                    this.nombre = "n/a";
                            ...
                    this.mail = "n/a";
                }   
        */
        
        Persona jp = new Persona("Juan","Pérez",'M',"Argentina","12345678","09/07/1990","Soltero","Bulnes 1526 4to C","jp90@gma1l.com","1123456789");
        Persona pr = new Persona("Pedro","Rodríguez");
        
        jp.presentarse();
        pr.presentarse();
        
        /* 
            Cuando se intenta mostrar un objeto con println(), Java invoca implícitamente al método toString() del mismo.
        
            Por lo tanto, escribir:
                System.out.println( jp );
            Es lo mismo que escribir:
                System.out.println( jp.toString() );
        
            El método toString() existe en TODOS los objetos, ya que es heredado de la superclase Object.
            Cuando el programador crea una clase, debería redefinir el método toString() con una salida a su gusto,
            ya que de lo contrario, se invoca al toString() original de Object que muestra solo una representación
            abstracta de la referencia de la instancia en memoria.
            (Ejemplo: clases.Persona@27bc2616)
        
            En la clase Persona, se redefinió el método toString() para que la salida sea más descriptiva.
        */
        System.out.println("\nAl tener el toString() redefinido, se puede mostrar un objeto directamente por consola: ");
        System.out.println( jp ); // Equivalente a: System.out.println( jp.toString() );
        System.out.println( pr ); // Equivalente a: System.out.println( pr.toString() );
    }
    
}

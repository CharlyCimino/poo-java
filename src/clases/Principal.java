
package clases;

public class Principal {

    public static void main(String[] args) {
        
        Persona jp = new Persona("Juan","Pérez",'M',"Argentina","12345678","09/07/1990","Soltero","Bulnes 1526 4to C","1123456789","jp90@gma1l.com");
        
        jp.presentarse();
        
        jp.setNombre("Luis");
        
        jp.presentarse();
        
        jp.setMail("mailIncorrecto");
        
        jp.presentarse();
        
        jp.setMail("lupe@gma1l.com");
        
        jp.presentarse();
    }
}

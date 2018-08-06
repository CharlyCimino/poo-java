
package clases;

public class Principal {

    public static void main(String[] args) {
        
        Persona jp = new Persona("Juan","Pérez",'M',"Argentina","12345678","09/07/1990","Soltero","Bulnes 1526 4to C","1123456789","jp90@gma1l.com");
        
        CuentaBancaria cb = new CuentaBancaria("jupe90", "Caja de ahorros", '$', jp);
        
        // Hay dos maneras de acceder a Juan Pérez:        
        jp.setNombre("Pedro");
        cb.getTitular().setApellido("Ramírez");
        
        jp.presentarse();
        System.out.println( cb );
    }
}


package clases;

public class Principal {

    public static void main(String[] args) {
        
        Persona jp = new Persona("Juan","Pérez",'M',"Argentina","12345678","09/07/1990","Soltero","Bulnes 1526 4to C","1123456789","jp90@gma1l.com");
        
        CuentaBancaria cb = new CuentaBancaria("jupe90", "Caja de ahorros", '$', jp);
        CuentaBancaria cb2 = new CuentaBancaria("jupe90_2", "Caja de ahorros", 'U', jp);
        CuentaBancaria cb3 = new CuentaBancaria("jupe-90", "Cuenta Corriente", '$', jp);
        
        // Observá la correlatividad de los CBUs
        
        System.out.println( cb );
        System.out.println( cb2 );
        System.out.println( cb3 );
    }
}

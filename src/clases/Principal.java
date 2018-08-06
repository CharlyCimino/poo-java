
package clases;

public class Principal {

    public static void main(String[] args) {
        
        // Gracias a los enumerados se estandarizan los valores
        
        Persona jp = new Persona("Juan","Pérez",Genero.MASCULINO,"Argentina","12345678","09/07/1990",EstadoCivil.SOLTERO,"Bulnes 1526 4to C","1123456789","jp90@gma1l.com");
        Persona mr = new Persona("María","Rodríguez",Genero.FEMENINO,"Venezuela","12345678","22/11/1983",EstadoCivil.CASADO,"Yatay 359","1124681357","rodriguezmaria@gma1l.com");
        
        CuentaBancaria cb = new CuentaBancaria("jupe90", TipoDeCuenta.CAJA_DE_AHORROS, Moneda.PESOS, jp);
        CuentaBancaria cb2 = new CuentaBancaria("maria123", TipoDeCuenta.CUENTA_CORRIENTE, Moneda.DOLARES, mr);
        
        
        System.out.println( jp );
        System.out.println( mr );
        System.out.println( cb );
        System.out.println( cb2 );
    }
}

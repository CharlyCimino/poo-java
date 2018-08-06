
package clases;

public class CuentaBancaria {
    private static long ultimoNumeroDeCuenta = 1728392018; // Las variables de clase son visibles por todas las instancias de la clase
    private final String CBU;
    private String alias;
    private final String tipo;
    private final char moneda;
    private double saldo;
    private Persona titular;

    public CuentaBancaria(String alias, String tipo, char moneda, Persona titular) {
        CuentaBancaria.ultimoNumeroDeCuenta++; // Al instanciar, se incrementa el contador de cuentas bancarias
        this.CBU = obtenerCBU( CuentaBancaria.ultimoNumeroDeCuenta ); // Se genera un CBU con el formato adecuado
        this.alias = alias;
        this.tipo = tipo;
        this.moneda = moneda;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "CBU=" + CBU + ", alias=" + alias + ", tipo=" + tipo + ", moneda=" + moneda + ", saldo=" + saldo + ", titular=" + titular + '}';
    }
    
    public void extraer(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    /*
        Los métodos obtenerCBU(), numeroFormateado() y azar() son de clase (static) ya que no es necesario que su implementación
        esté replicada en memoria por cada instancia. Al ser de clase, solo se define una vez para la clase CuentaBancaria.
        Todas las instancias de la clase CuentaBancaria pueden acceder a los atributos y métodos de clase.
        Para que un método pueda ser de clase, no debe tener en su implementación referencias a métodos o atributos de instancia.
    */
    
    private static String obtenerCBU (long nroCuenta) {
        /*
            La CBU está compuesta por 22 dígitos, separados en dos bloques.
            El primer bloque tiene un número de entidad de 3 dígitos, un número de sucursal de 4 dígitos y un dígito verificador.
            El segundo bloque tiene un número de 13 dígitos que identifica la cuenta dentro de la entidad y la sucursal, más un dígito verificador.
        */
        String nroEntidad = CuentaBancaria.numeroFormateado( azar(999) + 1 , 3);
        String nroSucursal = CuentaBancaria.numeroFormateado( azar(9999) + 1 , 4);
        String nroCuentaString = CuentaBancaria.numeroFormateado(nroCuenta, 13);
        return nroEntidad + nroSucursal + 8 + nroCuentaString + 8;
    }
    
    private static String numeroFormateado (long numero, int cantDigitos) {
        String numFormateado = numero + "";
        int longitudInicial = numFormateado.length();
        for (int i = 0; i < cantDigitos-longitudInicial ; i++) {
            numFormateado = "0" + numFormateado;
        }
        return numFormateado;
    }
    
    private static int azar (int x) {
        return (int) ( Math.random() * x );
    }
    
    /*
        Lo siguiente no es válido:
    
            public static void cambiarAlias(String nuevo) {
                this.alias = nuevo;
            }
            
        En un contexto de clase (static) no se puede acceder a contextos de instancia (no static)
    */

    public double getSaldo() {
        return saldo;
    }

    public String getCBU() {
        return CBU;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTipo() {
        return tipo;
    }

    public char getMoneda() {
        return moneda;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }
}


package clases;

public class CuentaBancaria {
    private final String CBU;
    private String alias;
    private final String tipo;
    private final char moneda;
    private double saldo;
    private Persona titular; // Una cuenta bancaria pertenece a una y solo una persona

    public CuentaBancaria(String alias, String tipo, char moneda, Persona titular) {
        this.CBU = "0";
        this.alias = alias;
        this.tipo = tipo;
        this.moneda = moneda;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "CBU=" + CBU + ", alias=" + alias + ", tipo=" + tipo + ", moneda=" + moneda + ", saldo=" + saldo + ", titular=" + titular + '}';
    }

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

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }
}

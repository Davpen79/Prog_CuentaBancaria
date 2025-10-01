public class CuentaBancaria {

    //Atributos

    private String titular;
    private double saldo;

    //Getter y Setter

    public String getTitular() {

        return titular;
    }

    public void setTitular(String titular) {

        this.titular = titular;
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    //Constructores

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //Funciones

    public double depositarCash(double dinero) {

        this.saldo = saldo + dinero;
        return this.saldo;
    }

    public double retirarCash(double dinero) {

        this.saldo = saldo - dinero;
        return  this.saldo;
    }
}

public class CuentaBancaria {

    //Atributos

    private String titular;
    private double saldo;

    private double movimiento;

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

    public double depositarCash(){
        return this.saldo + movimiento;
    }

    public double retirarCash(){

        if((this.saldo - movimiento) < 0){
            System.out.println("No hay saldo suficiente");
        }

        return this.saldo - movimiento;

    }
}

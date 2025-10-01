import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        enum Movimientos {RETIRADA, DEPOSITO}

        System.out.println("Bienvenido a su Querido Banco.\n" +
                "Por favor Ingrese el nombre del Titular de la cuenta.");
        Scanner sc = new Scanner(System.in);
        String titular = sc.nextLine();
        double saldo = 0;

        CuentaBancaria cuentaUsuario = new CuentaBancaria(titular,0);
        titular = cuentaUsuario.getTitular();
        saldo = cuentaUsuario.getSaldo();

        System.out.println("Hola " + titular);
        System.out.println("El saldo de tu cuenta es de " + saldo + " euros");

    }
}

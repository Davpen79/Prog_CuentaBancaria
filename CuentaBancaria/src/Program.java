import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        System.out.println("Bienvenido a su Querido Banco.\n" + "Por favor Ingrese el nombre del Titular de la cuenta.");
        Scanner sc = new Scanner(System.in);
        String titular = sc.nextLine();
        double saldo = 0;

        CuentaBancaria cuentaUsuario = new CuentaBancaria(titular, 0);

        titular = cuentaUsuario.getTitular();
        saldo = cuentaUsuario.getSaldo();

        int optionSelected = 1;

        while (optionSelected != 3) {

            System.out.println("Hola " + titular);
            System.out.println("El saldo de tu cuenta es de " + saldo + " euros");
            System.out.println("Que operacion deseas realizar?\n" + "1. Deposito\n" + "2. Retirada\n" + "3. Salida");

            optionSelected = sc.nextInt();

            if (optionSelected == 1) {
                System.out.println("Cuantos euros quieres depositar");
                Scanner sd = new Scanner(System.in);
                double dinero = sd.nextDouble();
                saldo = cuentaUsuario.depositarCash(dinero);
                System.out.println("Tu saldo actual es " + saldo);
            }
            if (optionSelected == 2) {

                System.out.println("Cuantos euros quieres retirar");
                Scanner sd = new Scanner(System.in);
                double dinero = sd.nextDouble();
                if (dinero <= saldo) {
                    saldo = cuentaUsuario.retirarCash(dinero);
                    System.out.println("Tu saldo actual es " + saldo);
                } else {
                    System.out.println("Tu saldo actual no es suficiente para realizar esta operacion");
                }
            } else {
                System.out.println("Que tengas un buen dia");
            }
        }


    }
}

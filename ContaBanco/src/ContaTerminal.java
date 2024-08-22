import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Por favor, insira a sua Agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o numero da sua Conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, insira o seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();


        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é: " + agencia + ", conta " + numero + ", e seu saldo " + saldo + " já está disponível para saque.");



        

    }
}

import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia = "";
        String nomeCliente = "";
        double saldo;

        System.out.println("Por favor, digite o número da agência: ");
        numero = scanner.nextInt();

        System.out.println("Digite a agência; ");
        agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Digite o saldo: ");
        saldo =  scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}


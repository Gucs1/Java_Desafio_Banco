import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        var numeroConta = scanner.nextInt();

        System.out.print("Digite a agência : ");
        var agenciaConta = scanner.next();

        System.out.print("Digite seu nome : ");
        scanner.nextLine();
        var nomeCliente = scanner.nextLine();

        System.out.print("Digite seu saldo : ");
        var saldoConta = scanner.nextDouble();

        System.out.print("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agenciaConta +", conta " + numeroConta + " e seu saldo "+ saldoConta +" já está disponível para saque.");
    }
}

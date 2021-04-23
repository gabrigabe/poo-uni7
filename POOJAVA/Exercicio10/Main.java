package Exercicio10;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Checar saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("0 - Sair do sistema");
            System.out.print("Sua opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println(("Você tem  R$ " + poupanca.getSaldo() + " de saldo"));
            }

            if (opcao == 2) {
                try {
                    double saque = 0;
                    System.out.println("Digite o quanto você quer sacar?: ");
                    saque = scanner.nextDouble();
                    poupanca.sacar(saque);
                } catch (SaldoInsuficienteException e) {
                    System.out.println(e.getMessage());

                } catch (SaqueNegativoException e) {
                    System.out.println("Erro! não é possivel sacar um valor negativo");
                } catch (Exception e) {
                    System.out.println("Ocorreu um erro inesperado, contate o suporte!");
                }
            }
            if (opcao == 3) {
                try {
                    double deposito = 0;
                    System.out.println("Digite o quanto você quer depositar: ");
                    deposito = scanner.nextDouble();
                    poupanca.depositar(deposito);
                    System.out.println("Depositado com sucesso!");

                } catch (DepositoNegativoException e) {
                    System.out.println("Erro: Você não pode depositar saldos negativos!");
                } catch (Exception e){
                    System.out.println("Ocorreu um erro inesperado, contate o suporte!");
                }


            }
        } while (opcao != 0);
    }

    public static void opcao1() {
        System.out.println("OP 1");
    }
}

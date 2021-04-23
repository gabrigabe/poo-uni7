package Exercicio10;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("0 - Sair do sistema");
            System.out.print("Sua opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                opcao1();
            }
            if (opcao == 2) {
                try {
                    double deposito = 0;
                    System.out.println("Digite o quanto você quer depositar: ");
                    deposito = scanner.nextDouble();
                    poupanca.depositar(deposito);
                    System.out.println("Depositado com sucesso!");

                } catch (DepositoNegativoException e) {
                    System.out.println("Erro no deposito");
                }

            }
        } while (opcao != 0);
    }

    public static void opcao1() {
        System.out.println("OP 1");
    }
}

       /** try {
            poupanca.depositar(100);
            poupanca.depositar(-10);
        } catch (Exception e) {
            System.out.println("deu erro no deposito");
        }

        try {
            poupanca.sacar(5);
            poupanca.sacar(500);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());

        } catch (SaqueNegativoException e) {
            System.out.println("tá bebado? não dá pra sacar negativo!!!");
        } catch (Exception e) {
            System.out.println("deu um erro qualquer no saque");
        }

        System.out.println("Meu saldo final é: " + poupanca.getSaldo());
    }

}**/
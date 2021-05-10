package Banco11;
import java.util.Scanner;

import static Banco.Conta.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao1 = 0;
        do{
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Abrir uma nova conta:");
            System.out.println("2 - Entrar em uma conta existente");
            System.out.println("0 - Sair");
            opcao1 = scanner.nextInt();

            if (opcao1 == 1){
                int opcao2 = 0;
                do {
                    System.out.println("Que tipo de conta deseja abrir?:");
                    System.out.println("1 - Conta corrente:");
                    System.out.println("2 - Conta Poupanca");
                    System.out.println("0 - voltar");
                    opcao2 = scanner.nextInt();

                    if (opcao2 == 1){
                        Conta ContaCorrente = new Conta();
                        String tipo = "Conta Corrente";
                        Conta.setTipo();
                        System.out.println("Digite o nome da conta: ");
                        Conta.setNome() = scanner.nextLine();

                    }
                }while (opcao2!=0);
        }
            if (opcao1 == 2){
                System.out.println("teste");
            }
            if (opcao1 > 2){
                System.out.println("Opção invalida");
            }

    } while (opcao1!=0);

}}

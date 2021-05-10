import java.util.Random;
import java.util.Scanner;
import java.util.Set;


import Contas.CadastroConta;
import Contas.Conta;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random RANDOM = new Random();
        CadastroConta cadastro = new CadastroConta();
        Conta conta = new Conta();
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
                        conta = new Conta();
                        System.out.println("Abertura de Conta Corrente");
                        conta.setTipoConta("ContaC");
                        System.out.println("Digite seu nome: ");
                        conta.setNome(scanner.next());
                        System.out.println("Ok " + conta.getNome() + " agora, digite seu cpf");
                        conta.setCpf(scanner.nextInt());
                        conta.setNumconta(1000000 + RANDOM.nextInt(100000));
                        cadastro.registrar(conta);
                        System.out.println("Cadastro finalizado, seu numero de conta vai ser " + conta.getNumconta() + " e este também será seu login" );
                        System.out.print("\n");
                    }
                    if (opcao2 == 2){
                        conta = new Conta();
                        System.out.println("Abertura de Conta Poupança");
                        conta.setTipoConta("ContaP");
                        System.out.println("Digite seu nome: ");
                        conta.setNome(scanner.next());
                        System.out.println("Ok " + conta.getNome() + " agora, digite seu cpf");
                        conta.setCpf(scanner.nextInt());
                        conta.setNumconta(2000000 + RANDOM.nextInt(100000));;
                        cadastro.registrar(conta);
                        System.out.println("Cadastro finalizado, seu numero de conta vai ser " + conta.getNumconta() + " e este também será seu login" );
                        System.out.print("\n");
                    }

                    }while (opcao2!=0);
        }
            if (opcao1 == 2){
                 cadastro.getContas();
                Object Nome = scanner.nextInt();

               if(Nome.equals(conta.getNumconta())){
                   int opcao3 = 0;
                   do{
                     System.out.println("Bem vindo " + conta.getNome());
                     System.out.println("1 - Ver informações da conta");
                     System.out.println("2 - Realizar saque");
                     System.out.println("3 - Realizar deposito");
                     System.out.println("4 - Realizar transferencia");
                     System.out.println("5 - Encerrar conta");
                     System.out.println("0 - Sair");
                     opcao3 = scanner.nextInt();

                     if (opcao3 == 1){
                        for (Conta contas : cadastro.getContas()) {
                            System.out.println(contas);
                        }
                
                    }
                    if (opcao3 == 2){
                        double saque = 0;
                        System.out.println("Digite o quanto você quer sacar?: ");
                        saque = scanner.nextDouble();
                        conta.setSaldo(conta.getSaldo() - saque);
                    }
                    if (opcao3 == 3){
                        double deposito = 0;
                        System.out.println("Digite o quanto você quer sacar?: ");
                        deposito = scanner.nextDouble();
                        conta.setSaldo(conta.getSaldo() + deposito);
                    }
                    if (opcao3 == 4){
                        double quantia = 0;
                        System.out.println("Digite a quantia:");
                        quantia = scanner.nextDouble();
                        conta.setSaldo(conta.getSaldo() - quantia);
                        System.out.println("Digite a conta que voce quer transferir: ");
                        conta.setNumconta(scanner.nextInt());
                        conta.setSaldo(conta.getSaldo() + quantia);
                        System.out.println("Você transferiu R$ " + quantia + " para a conta " + conta.getNumconta(1));

                        
                    }
                    if (opcao3 == 5){
                        conta.setNumconta(0);
                        conta.setSaldo(0);
                        opcao3=0;
                    }
                    }while (opcao3!=0);
               }
               else{
                   System.out.println("Fail");
               }

              } 

        
        
            if (opcao1 > 2){
                System.out.println("Opção invalida");
            }

    } while (opcao1!=0);


}}

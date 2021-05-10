package Banco11;
import java.util.Random;

public class Conta {


    private String nome;
    private String cpf;
    private String tipo;
    private static int numconta;
    private int agencia;
    private double saldo;
    protected String senha;


    public Conta() {
        Random random = new Random();
        this.nome = " ";
        this.cpf = " ";
        this.tipo = " ";
        this.numconta = 10000 + random.nextInt(1000);
        this.agencia = 1;
        this.saldo = 0;
        this.senha = " ";

        System.out.println(numconta);

    }


    public int getAgencia() {
        return agencia;
    }

    public static int getConta() {
        return numconta;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setConta(int conta) {
        this.numconta = conta;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setTipo() {
        this.tipo = tipo;
    }
}

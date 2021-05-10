package Contas;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.Arrays;

public class Conta {
    private int[] id;
    private int numconta;
    private String tipoconta;
    private String nome;
    private int cpf;
    private double saldo;
    protected String senha;

    public int[] getId(){
        return id;
    }

    public void setId(int[] id){
        this.id = id;
    }


    public int getNumconta(){
        return numconta;
    }
    public void setNumconta(int numconta){
        this.numconta = numconta;
    }
    public String getTipoconta(){
        return tipoconta;
    }
    public void setTipoConta(String tipoconta){
        this.tipoconta = tipoconta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getSenha(){
        return senha;
    }


    public String toString() {
        return "Conta{" +
                "Conta = '" + numconta + ", "+ '\'' +
                "Tipo de conta = '" + tipoconta  + ", " + '\'' +
                "Saldo = '" + saldo +  '\'' +

                '}';
    }


    public boolean equals(Object o) {
        if (o == this)
         return true;
        if (!(o instanceof Conta)) {
            Conta outraConta = (Conta) o;
            if (getNumconta()!= 0)
                return getNumconta() == (outraConta.getNumconta());
        }
        return false;
    }


    public int hashCode() {
        return Objects.hash(getNumconta());
    }
    public Conta getNumconta(Object nome2) {
        return null;
    }

    
}

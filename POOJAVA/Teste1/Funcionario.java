package Teste1;

public class Funcionario {
    private static float salario;
    private String nome;
    private int matricula;
    public Funcionario() {}

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setMatricula(int i){
        this.matricula = i;

    }
    public int getMatricula(){
        return matricula;
    }

    public void setSalario(float salario) {Funcionario.salario = salario;}
    public static float getSalario(){return salario;}
}

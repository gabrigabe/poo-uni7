package Teste1;

public class Main{

    public static void realizarPagamento(Funcionario funcionario){}
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Alex");
        funcionario.setMatricula(2398);
        funcionario.setSalario(1500);


        Professor professor = new Professor();
        professor.setNome("Marum");
        professor.setMatricula(2399);
        professor.setSalario(2500);
        professor.setDisciplinas(new String[]{
                "Poo", "Redes 1"

        });

        System.out.println(funcionario.getNome() + ' ' + "R$ " +  funcionario.getSalario());
        System.out.println(professor.getNome() + ' ' + " R$ "+ professor.getSalario());

    }

}

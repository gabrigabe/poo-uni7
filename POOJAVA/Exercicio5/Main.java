import Teste1.Funcionario;
import Teste1.Professor;

public class Main{

    public static void realizarPagamento(Funcionario funcionario){}
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Alex");
        funcionario.setMatricula(2398);


        Professor professor = new Professor();
        professor.setNome("Marum");
        professor.setMatricula(23981);
        professor.setDisciplinas(new String[]{
            "Poo", "Redes 1"

        });

        System.out.println(funcionario.getNome());
        System.out.println(professor.getNome());

        funcionario = professor;
        System.out.println(funcionario.getNome());
    }
    
}

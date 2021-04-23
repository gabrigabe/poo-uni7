package Teste1;

import Teste1.Funcionario;

public class Professor extends Funcionario {
    private String [] disciplinas;
    public Professor() {}
    
    public void setDisciplinas(String[] disciplinas){
        this.disciplinas = disciplinas;
    }
    public String[] getDisciplinas(){
        return disciplinas;
    }
}

/*
funcionario
^
|
|
Teste1.Professor

*/

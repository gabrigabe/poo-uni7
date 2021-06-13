public class AumentarOuDiminuirDez implements Calculos {
    public double calcular(Funcionario funcionario){
        if(funcionario.getSalario() > 2500){
            return funcionario.getSalario() * 0.9;

        }
        else{
            return funcionario.getSalario()* 1.1;
        }
    }
    
}

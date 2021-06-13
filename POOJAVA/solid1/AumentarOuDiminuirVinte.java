public class AumentarOuDiminuirVinte implements Calculos {
    public double calcular(Funcionario funcionario){
        if(funcionario.getSalario() > 5000){
            return funcionario.getSalario() * 0.8;

        }
        else{
            return funcionario.getSalario()* 1.2;
        }
    }
    
    
}
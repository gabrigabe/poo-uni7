import java.time.LocalDate;

public class CarroEletrico implements Veiculos, VeiculosComCNH{
    Veiculo veiculo;
    Motorista motorista;
    Motor motor;
    Motorista motoristaAtual;
    public String nome(String string){
        return "CarroEletrico";
    }
    public void renovarCNH(){
        LocalDate vencimentoCNH = motorista.getVencimentoCNH();
        if (vencimentoCNH.isBefore(LocalDate.now())) {
            throw new InfracaoException(motorista.getNome() + " com CNH vencida!");
        }
    }
    public void dirigir(){
        motor.ligar();
        System.out.println("Carro Elétrico sendo dirigido pelo " + motorista.getNome() + "Ou sozinho");

    }

    public void estacionar(){
        motor.desligar();
        motoristaAtual = null;
        System.out.println("Carro Elétrico estacionado");
        
    }
    
}

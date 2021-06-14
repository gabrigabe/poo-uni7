import java.time.LocalDate;

public class VeiculoActions implements InterfaceVeiculo, InterfaceEstacionar{
      Veiculo veiculo;
      Motorista motorista;
      Motor motor;
      Motorista motoristaAtual;
    public void dirigir(Motorista motorista) {
        if (motorista == null) {
            throw new NullPointerException("Um carro não se dirige sozinho... motorista é nulo!");
        }

        motoristaAtual = motorista;

        if (veiculo.getTipoDeVeiculo() == TipoDeVeiculo.BICICLETA) {
            System.out.println("bicicleta sendo pilotada pelo " + motorista.getNome());
        } else {
            LocalDate vencimentoCNH = motorista.getVencimentoCNH();
            if (vencimentoCNH.isBefore(LocalDate.now())) {
                throw new InfracaoException(motorista.getNome() + " com CNH vencida!");
            }

            motor.ligar();
            System.out.println(veiculo.getTipoDeVeiculo() + " sendo dirigido pelo " + motorista.getNome());
        }
    }

    public void estacionar() {
        motor.desligar();
        motoristaAtual = null;
        System.out.println(veiculo.getTipoDeVeiculo() + " estacionado");
    }


}

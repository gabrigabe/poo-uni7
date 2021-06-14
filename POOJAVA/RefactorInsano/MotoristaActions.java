
public class MotoristaActions implements InterfaceMotorista, InterfaceCNH, InterfaceEstacionar{
    Veiculo veiculo;
    VeiculoActions acaoVeiculo;
    Motorista motorista;
    public TipoDeVeiculo veiculoAtual;

    public void renovarCNH() {
        motorista.setVencimentoCNH(motorista.getVencimentoCNH().plusYears(5));
    
    }

    public void dirigir(Veiculo veiculo) {
        veiculo.dirigir(this);
        veiculoAtual = veiculo.getTipoDeVeiculo();
    }

    public void estacionar() {
        if (veiculoAtual == null)
            throw new NullPointerException("não tem veiculo pra estacionar pq não estava dirigindo...");
        acaoVeiculo.estacionar();
        veiculoAtual = null;
    }

    public void melhorarMotor() {
        Motor motor = veiculo.getMotor();
        int producaoDeCarbono = motor.getProducaoDeCarbono();
        producaoDeCarbono = producaoDeCarbono - 2;
        motor.setProducaoDeCarbono(producaoDeCarbono);
        
    }
    
}

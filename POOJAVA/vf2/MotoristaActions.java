
public class MotoristaActions implements InterfaceMotorista{
    Veiculo veiculo;
    Veiculos veiculos;
    Motorista motorista;
    public Veiculos veiculoAtual;

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
        veiculos.estacionar();
        veiculoAtual = null;
    }
    
}

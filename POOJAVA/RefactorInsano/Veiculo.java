public class Veiculo {

    private final TipoDeVeiculo tipoDeVeiculo;
    private final Motor motor;
    private Motorista motoristaAtual;

    public Veiculo(TipoDeVeiculo tipoDeVeiculo, Motor motor) {
        if (tipoDeVeiculo == null)
            throw new NullPointerException("Precisa passar um tipo de veiculo!!");
        this.tipoDeVeiculo = tipoDeVeiculo;
        this.motor = motor;
    }

    public TipoDeVeiculo getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Motorista getMotoristaAtual() {
        return motoristaAtual;
    
    }
    
}
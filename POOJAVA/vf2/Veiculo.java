
public class Veiculo {

    private final Veiculos veiculos;
    private final Motor motor;
    private Motorista motoristaAtual;

    public Veiculo(Veiculos veiculos, Motor motor) {
        if (veiculos == null)
            throw new NullPointerException("Precisa passar um tipo de veiculo!!");
        this.veiculos = veiculos;
        this.motor = motor;
    }

    public Veiculos getTipoDeVeiculo() {
        return veiculos;
    }

    public Motor getMotor() {
        return motor;
    }

    public Motorista getMotoristaAtual() {
        return motoristaAtual;
    }

    public void dirigir(MotoristaActions motoristaActions) {
    }

}
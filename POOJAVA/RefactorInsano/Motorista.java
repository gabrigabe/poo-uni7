import java.time.LocalDate;

public class Motorista implements InterfaceEstadoMotorista{
    private final String nome;
    private LocalDate vencimentoCNH;
    private Veiculo veiculoAtual;   
    public Motorista(String nome, LocalDate vencimentoCNH) {
        this.nome = nome;
        this.vencimentoCNH = vencimentoCNH;
    }
    public void dirigir(Motorista motorista) {
        veiculo.dirigir(this);
        veiculoAtual = veiculo;
    }

    public void estacionar(){};

}

import java.time.LocalDate;

public class Motorista extends MotoristaActions{
    
    private String nome;
    private LocalDate vencimentoCNH;

    public Motorista(String nome, LocalDate vencimentoCNH) {
        this.nome = nome;
        this.vencimentoCNH = vencimentoCNH;
    }

    public String getNome() {
        return nome;
    }
    
    public LocalDate getVencimentoCNH() {
        return vencimentoCNH;
    }
    public void setVencimentoCNH(LocalDate vencimentoCNH) {
        this.vencimentoCNH = vencimentoCNH;
    }
}
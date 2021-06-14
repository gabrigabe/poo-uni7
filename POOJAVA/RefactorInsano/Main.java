import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(150);
        Veiculo veiculo = new Veiculo(TipoDeVeiculo.CARRO, motor);
        Motorista seuZe = new Motorista("Seu zé", LocalDate.of(2020, 12, 31));
        try {
            seuZe.dirigir(veiculo);
        } catch (InfracaoException e) {
            System.out.println(e.getMessage());
            seuZe.renovarCNH();
        }
        seuZe.dirigir(veiculo);



}
}
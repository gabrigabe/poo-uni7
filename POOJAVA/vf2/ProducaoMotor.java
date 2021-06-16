public class ProducaoMotor extends Motor{
    Veiculo veiculoAtual;
    public ProducaoMotor(int producaoDeCarbono) {
        super(producaoDeCarbono);
    }
    
    public int getProducaoDeCarbono() {
        return producaoDeCarbono;
    }

    public void setProducaoDeCarbono(int producaoDeCarbono) {
        if (producaoDeCarbono < 0)
            throw new IllegalArgumentException("Produção de carbono menor que 0? É bom que salva o planeta...");
        this.producaoDeCarbono = producaoDeCarbono;
    }


}
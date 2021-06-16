public class Motor extends MotoristaActions {
    ProducaoMotor pMotor;
    protected int producaoDeCarbono;
    protected boolean ligado;

    public Motor(int producaoDeCarbono) {
        this.producaoDeCarbono = producaoDeCarbono;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Produzindo " + producaoDeCarbono + " litros de CO2 para a atmosfera");
        }
    }

    public void desligar() {
        ligado = false;
    }

    public void melhorarMotor() {
        if (veiculoAtual == null)
            throw new NullPointerException("não tem veiculo pra melhorar o motor...");

        veiculo.getMotor();
        int producaoDeCarbono = pMotor.getProducaoDeCarbono();
        producaoDeCarbono = producaoDeCarbono - 2;
        pMotor.setProducaoDeCarbono(producaoDeCarbono);
    }

}
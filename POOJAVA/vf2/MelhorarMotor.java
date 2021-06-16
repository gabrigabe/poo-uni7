public class MelhorarMotor extends MotoristaActions {
    ProducaoMotor pMotor;
    public void melhorarMotor() {
        if (veiculoAtual == null)
            throw new NullPointerException("não tem veiculo pra melhorar o motor...");

        veiculo.getMotor();
        int producaoDeCarbono = pMotor.getProducaoDeCarbono();
        producaoDeCarbono = producaoDeCarbono - 2;
        pMotor.setProducaoDeCarbono(producaoDeCarbono);
    }
    
}

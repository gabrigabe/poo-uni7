public class MelhorarMotor implements InterfaceUpgradeMotor {
    public void melhorarMotor() {
        private Veiculo veiculoAtual;
        if (veiculoAtual == null)
            throw new NullPointerException("não tem veiculo pra melhorar o motor...");

        Motor motor = veiculoAtual.getMotor();
        int producaoDeCarbono = motor.getProducaoDeCarbono();
        producaoDeCarbono = producaoDeCarbono - 2;
        motor.setProducaoDeCarbono(producaoDeCarbono);
    }
    
}

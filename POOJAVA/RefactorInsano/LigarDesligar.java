public class LigarDesligar implements InterfaceMotor {
    
    private boolean ligado;

    public void ligar() {
        if (!ligado) {
            ligado = true;
            
            System.out.println("Produzindo " + producaoDeCarbono + " litros de CO2 para a atmosfera");
        }
    }

    public void desligar() {
        ligado = false;
    }

    
}

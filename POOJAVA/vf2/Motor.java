public class Motor {

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

}
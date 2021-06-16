public class Bicicleta implements Veiculos {
    Motorista motorista;
    Motor motor;
    Motorista motoristaAtual;

    public String nome(String string){
        return "Bicicleta";
    }
    public void dirigir(){
        if (motorista == null) {
            throw new NullPointerException("Um carro não se dirige sozinho... motorista é nulo!");
        }
        System.out.println("bicicleta sendo pilotada pelo " + motorista.getNome());

    }

    public void estacionar(){
        motor.desligar();
        motoristaAtual = null;
        System.out.println("Bicicleta estacionada");
        
    }
    
     
}

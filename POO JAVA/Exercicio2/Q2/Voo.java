package Exercicio2.Q2;

public class Voo {
	public static final int AcentosDisponiveis = 0;
	public static int HorarioDoVoo = 16;
	int AcentosComprados;
    private int CapacidadeVoo = Main.CapacidadedeVoo;

    public int AcentosDisponiveis(){
        return (CapacidadeVoo - AcentosComprados);

    }
    public void AcentosComprados(){
        AcentosComprados = 5;

    }

}

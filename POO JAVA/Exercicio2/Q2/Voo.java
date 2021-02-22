package Exercicio2.Q2;

public class Voo {
	public static int AcentosDisponiveis = 0;
    public static int HorarioDoVoo = 16;
    int AcentosComprados = 25;
    int CapacidadeVoo = Main.CapacidadedeVoo;

    public void AcentosDisponiveis() {
        AcentosDisponiveis = (CapacidadeVoo + AcentosComprados);

    }
    public void AcentosComprados(){
        AcentosComprados = 5;

    }

    }


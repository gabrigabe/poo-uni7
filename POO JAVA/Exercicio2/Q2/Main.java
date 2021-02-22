package Exercicio2.Q2;

public class Main {
    private static final int NumeroVoo = 01;
	public static final int CapacidadedeVoo = 100;
    public  final int HorarioDoVoo = Voo.HorarioDoVoo;
    public static final int AcentosDisponiveis = Voo.AcentosDisponiveis;

    public int getNumeroVoo() {
        return NumeroVoo;
    }
    public static void main(String[] args) {
       Data data = new Data(); 
        data.showData();
    }
    public final int getCapacidadeVoo() {
       return CapacidadedeVoo;
    }
   public int getAcentosDisponiveis(){
       return AcentosDisponiveis;
   }
   public  int HorarioDoVoo(){
       return HorarioDoVoo;

   }
}

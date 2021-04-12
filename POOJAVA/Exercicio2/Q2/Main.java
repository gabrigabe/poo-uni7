package Exercicio2.Q2;

public class Main {
    private static final int NumeroVoo = 01;
	public static final int CapacidadedeVoo = 100;
    public static final int HorarioDoVoo = Voo.HorarioDoVoo;
    public static final int AcentosDisponiveis = Voo.AcentosDisponiveis - CapacidadedeVoo;

    public int getNumeroVoo() {
        return NumeroVoo;
    }
    public final int getCapacidadeVoo() {
       return CapacidadedeVoo;
    }
   public int getAcentosDisponiveis(){
       return AcentosDisponiveis;
   }
   public  int getHorarioDoVoo() {
       return HorarioDoVoo;

   }
   public static void main(String[] args) {
    Data data = new Data(); 
     data.showData();
     System.out.println ("Ira partir as "  + HorarioDoVoo +  " Horas");
     System.out.println ("Ainda restam " + AcentosDisponiveis + " acentos de " + CapacidadedeVoo);

   } 
   
 }


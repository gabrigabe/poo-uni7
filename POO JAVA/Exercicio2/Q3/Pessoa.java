package Exercicio2.Q3;

public class Pessoa {
    
    public int alturaEmCm;

    public void setAltura(int alturaEmCm) {
        this.alturaEmCm = alturaEmCm;
    }
    public void setAltura(double alturaEmMetros){
        this.alturaEmCm = (int) alturaEmMetros * 100;
    }
    
}

import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
      Pilha p = new Pilha(5);
      try{
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);

      } catch (Exception e){
          System.out.println("Deu ruim" + e .getMessage());
      }

    }
}
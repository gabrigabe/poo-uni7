public class Pilha {
    private int topo;
    private Object[] elementos;


    public Pilha(int capacidade){
        topo = -1;
    elementos = new Object[capacidade];
    }

    public void push(Object objeto){
        if(topo == elementos.length - 1){
            throw new PilhaCheiaException();
        }
        elementos[topo++] = objeto;
       
    }
    public Object pop(){
        if (topo>0){
            throw new PilhaVaziaException();

        }
        return elementos[topo--];
    }


    
}

package testepilha;


 public class Pilha {
    private int topo = -1;
    private int pilha[];
     
    public Pilha(int e){
        pilha = new int[e];
    }

    public int top(){
        /* Disparar excessão caso a pilha não tenha elementos. */
        return pilha[topo];
    }
     
    public void push(int e){
        /* Disparar excessão caso a pilha estourar (stack overflow).  */
        pilha[++topo]=e;
    }

    public int pop(){
        /* Disparar excessão caso a pilha estourar (stack underflow). */
        return pilha[topo--];  
    }
     
    public void pull(int e){
        /* Disparar excessão caso a pilha não tenha elementos (stack empty). */
        pilha[topo]=e;
    }
 
    public int get_number_element(){
        return topo+1;
    }
    
 }
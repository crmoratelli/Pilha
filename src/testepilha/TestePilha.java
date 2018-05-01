package testepilha;

public class TestePilha {

    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        
        p.push(0);
        p.push(1);
        p.push(2);

        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
    }
    
}

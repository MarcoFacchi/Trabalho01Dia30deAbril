
public class Exercicio05 {
    public static void main(String[] args) {
    int anterior = 0;
    int atual = 1;
    int proximo;  
    
    System.out.println("sequencia de fibonacci");
        for (int i = 3; i<=15; i=i+1) {
        proximo = anterior + atual;
        System.out.println(proximo);
        anterior = atual;
        atual = proximo;
            
        }
    }
}

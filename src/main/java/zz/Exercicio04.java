
public class Exercicio04 {
    public static void main(String[] args) {
        int base = 3;
        int resultado = 1;
        System.out.println("potencia de 3+" +resultado);
        for(int expoente = 1; expoente <= 15; expoente=expoente+1){
            resultado = resultado * base;
            System.out.println(resultado);
        }
    }
}

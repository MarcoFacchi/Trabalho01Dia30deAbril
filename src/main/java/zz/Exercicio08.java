
import java.util.Scanner;


public class Exercicio08 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        System.out.println("Digite os valores inteiros positivos (para parar, digite um valor negativo):");
        
        int valor;
        while ((valor = sc.nextInt()) >= 0) {
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }
        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi inserido.");
        }
    }
}


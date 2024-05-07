
import java.util.Scanner;


public class Exercicio07 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
        
        int TV = 0;
        double soma = 0;
        
        System.out.println("Digite os valores numéricos (para parar, digite um valor negativo):");
        
        while (true) {
            System.out.print("Digite um valor: ");
            double valor = scanner.nextDouble();
        if (valor < 0) {
            break;
        }
            soma += valor;
            TV++;
        }
        if (TV > 0) {
            double media = soma / TV;
            System.out.println("Somatório: " + soma);
            System.out.println("Média: " + media);
            System.out.println("Total de valores lidos: " + TV);
        } else {
            System.out.println("Nenhum valor positivo foi inserido.");
        }
    }
 }

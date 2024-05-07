
import java.util.Scanner;


public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double areaTotal = 0;

        System.out.println("Bem-vindo à calculadora de área residencial!");
            while (true) {
            System.out.println("\nDigite o nome do cômodo:");
            String nomeCômodo = sc.nextLine();
            System.out.println("Digite a largura do cômodo em metros:");
            double largura = sc.nextDouble();
            System.out.println("Digite o comprimento do cômodo em metros:");
            double comprimento = sc.nextDouble();
            double áreaCômodo = largura * comprimento;
            areaTotal += áreaCômodo;

            System.out.println("Área do cômodo '" + nomeCômodo + "': " + áreaCômodo + " metros quadrados.");
            System.out.println("Deseja calcular a área de outro cômodo? (SIM/NÃO)");
            sc.nextLine();
            String continuar = sc.nextLine().toUpperCase();
            if (!continuar.equals("SIM")) {
                break;
    }
}
        System.out.println("\nÁrea total da residência: " + areaTotal + " metros quadrados.");
    }
}
    

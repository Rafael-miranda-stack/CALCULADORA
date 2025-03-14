import java.util.Scanner;
public class Calculadora { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo à Calculadora de Multiplicação.");
        System.out.println("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double Resultado = num1 * num2;

        System.out.println("O resultado da multiplicação é " + Resultado);

    }
}
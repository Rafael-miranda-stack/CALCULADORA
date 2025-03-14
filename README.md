import java.util.Scanner;
public class Calculadora {
    public static void main (String[] args){
      
        Scanner scanner = new Scanner(System.in);
        int opcao;

       do { 
        System.out.println("CALCULADORA\nESCOLHA A OPÇÃO:");
        System.out.println("1. SOMAR");
        System.out.println("2. SUBTRAIR");
        System.out.println("3. DIVIDIR");
        System.out.println("4. MULTIPLICAR");
        System.out.println("0. SAIR");

      opcao = scanner.nextInt();

    if (opcao == 0) {
        System.out.println("Saindo... Até mais!");
       return; 
    }
    System.out.println("Digite o primeiro número:");
    double num1 = scanner.nextDouble();
    System.out.println("Digite o segundo número:");
    double num2 = scanner.nextDouble();
    try  {
    switch (opcao) {
        case 1:
        Somar  somar = new Somar();
        System.out.println("Resultado:" + somar.calcular(num1, num2));
        break;
        
        case 2:
        Subtrair subtrair = new Subtrair();
        System.out.println("Resultado:" + subtrair.calcular(num1, num2));
        break;

        case 3:
        Dividir dividir = new Dividir();
        System.out.println("Resultado:" + dividir.calcular(num1, num2)); 
        break;

        case 4:
        Multiplicar multiplicar = new Multiplicar();
        System.out.println("Resultado:" + multiplicar.calcular(num1, num2));
        break;

        default:
        System.out.println("Opção inválida!");
        break;
    }
    } catch (ArithmeticException e) {
        System.out.println("Erro: " + e.getMessage());
    }
    
}   while (opcao != 0);
    
    scanner.close();
       }
    }

public class Somar {
    public double calcular(double num1, double num2) {
        return num1 + num2;
    }
}

public class Multiplicar {
    public double calcular (double num1, double num2){
        return num1 * num2;
    }
}
public class Dividir {
    public double calcular (double num1,  double num2){
        return num1 / num2;
    }
}
public class Subtrair {
    public double calcular (double num1, double num2){
        return num1 - num2;
    }
}


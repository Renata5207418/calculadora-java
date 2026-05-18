import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Calculadora ===");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.println("Escolha uma opção:");
        int opcao = entrada.nextInt();

        System.out.println("Digite o primeio número:");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = entrada.nextInt();

        int resultado;

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("resultado da soma: " + resultado);                               
                break; 

            case 2:
                resultado = numero1 -numero2;
                System.out.println("Resultado da subtração: " + resultado);
                break;

            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                resultado = numero1 / numero2;
                System.out.println("Resultado da divisão: " + resultado);
                break;        
        }

        entrada.close();

    }


}
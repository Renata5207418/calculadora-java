import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class Main{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.##");

        ArrayList<String> historico = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {

            exibirMenu();
            opcao = entrada.nextInt();
            
            if (opcao == 0) {
                System.out.println("Encerrando a calculadora.");  
            }else if (opcao == 5) {
                exibirHistorico(historico);                        
            } else if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 5 ou 0 para sair.");
            } else {
                System.out.print("Digite o primeiro número: ");
                double numero1 = entrada.nextDouble();
                
                System.out.print("Digite o segundo número: ");
                double numero2 = entrada.nextDouble();

                double resultado;
                String conta;

                switch (opcao) {
                    case 1:
                        resultado = somar(numero1, numero2);
                        conta = formato.format(numero1) + " + " + formato.format(numero2) + " = " +formato.format(resultado);
                        System.out.println("Resultado da soma: " + formato.format(resultado));
                        historico.add(conta);
                        break;
                    case 2:
                        resultado = subtrair(numero1, numero2);
                        conta = formato.format(numero1) + " - " + formato.format(numero2) + " = " + formato.format(resultado);
                        System.out.println("Resultado da subtração: " + formato.format(resultado));
                        historico.add(conta);
                        break;
                    case 3:
                        resultado = multiplicar(numero1, numero2);
                        conta = formato.format(numero1) + " * " + formato.format(numero2) + " = " + formato.format(resultado);
                        System.out.println("Resultado da multiplicação: " + formato.format(resultado));
                        historico.add(conta);
                        break;
                    case 4:
                        if (numero2 == 0) {
                            System.out.println("Erro: Divisão por zero não é permitida.");
                        } else {
                            resultado = dividir(numero1, numero2);
                            conta = formato.format(numero1) + " / " + formato.format(numero2) + " = " + formato.format(resultado);
                            System.out.println("Resultado da divisão: " + formato.format(resultado));
                            historico.add(conta);   
                        }
                        break;
            }
           
        }    
    }    
        entrada.close();

    }

    public static void exibirMenu() {
        System.out.println("\n=== Escolha a operação desejada ===");
        System.out.println("\n1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Histórico de operações");
        System.out.println("Digite 0 para sair.");
        System.out.print("\nEscolha uma opção: ");
    }

    public static void exibirHistorico(ArrayList<String> historico) {
        System.out.println("\n=== Histórico de Operações ===");
        
        if (historico.isEmpty()) {
            System.out.println("Nenhuma operação realizada ainda.");
        } else {
            for (int i = 0; i < historico.size(); i++){
                System.out.println((i + 1) + ") " + historico.get(i));
            }            
        }
    }

    public static double somar(double numero1, double numero2) {
        return numero1 + numero2;        
    }
    
    public static double subtrair(double numero1, double numero2) {
        return numero1 - numero2;        
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;        
    }   

    public static double dividir(double numero1, double numero2) {
        return numero1 / numero2;        
    }

}
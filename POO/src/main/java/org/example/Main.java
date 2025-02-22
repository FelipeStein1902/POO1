package org.example;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner= new Scanner(System.in);
        int opcao = 5;
        int resultado = 0;
        int num1 = 0;
        int num2 = 0;

        while(opcao != 0){
            System.out.printf("=============================================\n");
            System.out.printf("\t\t %s \n", "CALCULADORA");
            System.out.printf("=============================================\n");
            System.out.println("\t[1] Adição (+)");
            System.out.println("\t[2] Subtração (-)");
            System.out.println("\t[3] Multiplicação (*)");
            System.out.println("\t[4] Divisão (/)");
            System.out.println("\t[0] Sair");
            System.out.printf("=============================================\n");
            System.out.printf("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao){
                case 0 :
                    System.out.println("Saindo da Calculadora....");
                    break;
                case 1:
                    System.out.println("Opção válida! Você escolheu a opção: " + opcao);
                    System.out.print("Escolha o primeiro número:");
                    num1 = scanner.nextInt();
                    System.out.print("Escolha o segundo número:");
                    num2 = scanner.nextInt();
                    resultado = num1 + num2;
                    System.out.println("Resultado:" + resultado);
                    break;
                case 2:
                    System.out.println("Opção válida! Você escolheu a opção: " + opcao);
                    System.out.println("Escolha o primeiro número:");
                    num1 = scanner.nextInt();
                    System.out.println("Escolha o segundo número:");
                    num2 = scanner.nextInt();
                    resultado = num1 - num2;
                    System.out.println("Resultado:" + resultado);
                    break;
                case 3:
                    System.out.println("Opção válida! Você escolheu a opção: " + opcao);
                    System.out.println("Escolha o primeiro número:");
                    num1 = scanner.nextInt();
                    System.out.println("Escolha o segundo número:");
                    num2 = scanner.nextInt();
                    resultado = num1 * num2;
                    System.out.println("Resultado:" + resultado);
                    break;
                case 4:
                    System.out.println("Opção válida! Você escolheu a opção: " + opcao);
                    System.out.println("Escolha o primeiro número:");
                    num1 = scanner.nextInt();
                    System.out.println("Escolha o segundo número:");
                    num2 = scanner.nextInt();
                    if (num2 == 0) {
                        System.out.println("Número Invalido...");
                    }else {
                        resultado = num1 / num2;
                        System.out.println("Resultado:" + resultado);
                    }
                    break;
                default:
                    System.out.println("Opção Invalida....");
                    break;
            }





        }

    }
}
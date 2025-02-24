/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package f.aulapoo;

import java.util.Scanner;

/**
 *
 * @author alunolab02
 */
public class Aulapoo {

    static Scanner scanner = new Scanner(System.in);
    static int opcao = 5;
    static int resultado = 0;

    public static int adc(int a, int b) {
        System.out.println("Opção válida! Você escolheu a opção: " + opcao);
        System.out.println("Escolha o primeiro número:");
        a = scanner.nextInt();
        System.out.println("Escolha o segundo número:");
        b = scanner.nextInt();
        resultado = a + b;
        System.out.println("Resultado:" + resultado);
        return a + b;
    }

    public static int sub(int a, int b) {
        System.out.println("Opção válida! Você escolheu a opção: " + opcao);
        System.out.println("Escolha o primeiro número:");
        a = scanner.nextInt();
        System.out.println("Escolha o segundo número:");
        b = scanner.nextInt();
        resultado = a - b;
        System.out.println("Resultado:" + resultado);
        return a - b;
    }

    public static int mult(int a, int b) {
        System.out.println("Opção válida! Você escolheu a opção: " + opcao);
        System.out.println("Escolha o primeiro número:");
        a = scanner.nextInt();
        System.out.println("Escolha o segundo número:");
        b = scanner.nextInt();
        resultado = a * b;
        System.out.println("Resultado:" + resultado);
        return a * b;
    }

    public static int div(int a, int b) {
        System.out.println("Opção válida! Você escolheu a opção: " + opcao);
        System.out.println("Escolha o primeiro número:");
        a = scanner.nextInt();
        System.out.println("Escolha o segundo número:");
        b = scanner.nextInt();
        if (b == 0) {
            System.out.println("Número Invalido...");
            return 0;
        } else {
            resultado = a / b;
            System.out.println("Resultado:" + resultado);
            return a / b;
        }
    }

    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        while (opcao != 0) {
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

            switch (opcao) {
                case 0:
                    System.out.println("Saindo da Calculadora....");
                    break;
                case 1:
                    adc(a, b);
                    break;
                case 2:
                    sub(a, b);
                    break;
                case 3:
                    mult(a, b);
                    break;
                case 4:
                    div(a, b);
                    break;
                default:
                    System.out.println("Opção Invalida....");
                    break;
            }
        }
    }
}

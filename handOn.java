package com.mycompany.handson;

import java.util.Scanner;

/**
 * @author gabrielrezende
 */
public class HandsOn {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n========== MENU DE EXERCÍCIOS ==========");
            System.out.println("1. Exercício 1");
            System.out.println("2. Exercício 2");
            System.out.println("3. Exercício 3");
            System.out.println("4. Exercício 4");
            System.out.println("5. Exercício 5");
            System.out.println("6. Exercício 6");
            System.out.println("7. Exercício 7");
            System.out.println("8. Exercício 8");
            System.out.println("9. Exercício 9");
            System.out.println("10. Exercício 10");
            System.out.println("0. Sair");
            System.out.println("========================================");
            System.out.print("Escolha uma opção: ");
            
            opcao = entrada.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo do programa... Até logo!");
                    break;
                    
                case 1:
                    System.out.println("\n--- Executando Exercício 1 ---");
                    System.out.println("Você esta no exercício 1");
                    break;
                case 2:
                    System.out.println("\n--- Executando Exercício 2 ---");
                    System.out.println("Você esta no exercício 1");
                    break;
                    
                case 3:
                    System.out.println("\n--- Executando Exercício 3 ---");
                    System.out.println("Você esta no exercício 3");
                    break;
                    
                case 4:
                    System.out.println("\n--- Executando Exercício 4 ---");
                    System.out.println("Você esta no exercício 4");
                    break;
                    
                case 5:
                    System.out.println("\n--- Executando Exercício 5 ---");
                    System.out.println("Você esta no exercício 5");
                    break;
                    
                case 6:
                    System.out.println("\n--- Executando Exercício 6 ---");
                    System.out.println("Você esta no exercício 6");
                    break;
                    
                case 7:
                    System.out.println("\n--- Executando Exercício 7 ---");
                    System.out.println("Você esta no exercício 7");
                    break;
                    
                case 8:
                    System.out.println("\n--- Executando Exercício 8 ---");
                    System.out.println("Você esta no exercício 8");
                    break;
                    
                case 9:
                    System.out.println("\n--- Executando Exercício 9 ---");
                    System.out.println("Você esta no exercício 9");
                    break;
                    
                case 10:
                    System.out.println("\n--- Executando Exercício 10 ---");
                    System.out.println("Você esta no exercício 10");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida! Por favor, digite um número de 0 a 10.");
                    break;
            }

        } while (opcao != 0);

        entrada.close();
    }
}
